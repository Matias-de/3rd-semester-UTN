package Modelo;

import JsonUtiles.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

public class Ssm implements Serializable {

    //atributos
    private int cantReactivos;
    private LinkedHashSet<Persona> personas;
    private HashMap<Integer, Registro> registroHashMap;
    private int contadorRegistros;

    //Constructores

    public Ssm(int cantReactivos, LinkedHashSet<Persona> personas, HashMap<Integer, Registro> registroHashMap) {
        this.cantReactivos = cantReactivos;
        this.personas = personas;
        this.registroHashMap = registroHashMap;
        contadorRegistros = 0;
    }

    public Ssm(int cantReactivos) {
        this.cantReactivos = cantReactivos;
        personas = new LinkedHashSet<>();
        registroHashMap = new HashMap<>();
        contadorRegistros = 0;
    }


    //getters


    public HashMap<Integer, Registro> getRegistroHashMap() {
        return registroHashMap;
    }

    public int getCantReactivos() {
        return cantReactivos;
    }

    public LinkedHashSet<Persona> getPersonas() {
        return personas;
    }

    public int getContadorRegistros() {
        return contadorRegistros;
    }

//setters


    public void setContadorRegistros(int contadorRegistros) {
        this.contadorRegistros = contadorRegistros;
    }

    public void setCantReactivos(int cantReactivos) {
        this.cantReactivos = cantReactivos;
    }

    public void setPersonas(LinkedHashSet<Persona> personas) {
        this.personas = personas;
    }

    public void setRegistroHashMap(HashMap<Integer, Registro> registroHashMap) {
        this.registroHashMap = registroHashMap;
    }


    //metodos


    @Override
    public String toString() {
        return "Ssm{" +
                "cantReactivos= " + cantReactivos +
                ",\n personas= " + personas +
                ",\n registroHashMap=" + registroHashMap +
                '}';
    }


    public void agregarPersona(Persona persona) throws NoMasActivosEXN {
        if (cantReactivos <= 0) {
            throw new NoMasActivosEXN("no hay mas activos, ingrese mas");

        }

        contadorRegistros++;
        persona.setNroKit(contadorRegistros);
        personas.addLast(persona);
        cantReactivos--;

    }


    public void testear() {
        Iterator<Persona> personaIterator = personas.iterator();
        while (personaIterator.hasNext()) {
            Persona personita = personaIterator.next();
            double temperatura = 0;
            while (!(temperatura <= 40) || !(temperatura >= 36)) {
                temperatura = Math.random() * 36 + 4;

            }

            temperatura = Math.round(temperatura * 10.0) / 10.0;
            registroHashMap.put(personita.getNroKit(), new Registro(personita.getDni(), temperatura));

        }

    }


    public String buscarBarrioDePersonaXDni(String DNI) {
        String barrio = "";
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona aux = it.next();
            if (aux.getDni().equalsIgnoreCase(DNI)) {
                barrio = aux.getBarrio();
            }
        }
        return barrio;
    }

    public String aislar() {
        String rta = "";
        Iterator<Map.Entry<Integer, Registro>> entryIterator = registroHashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, Registro> registroEntry = entryIterator.next();
            Registro aux = registroEntry.getValue();

            if (aux.getTemperatura() > 38) {
                String barrio = null;
                try {
                    barrio = buscarBarrioDePersonaXDni(aux.getDni());
                    throw new AltaTemperaturaEXN("SE DEBE AISLAR AAA", registroEntry.getKey(), barrio);
                } catch (AltaTemperaturaEXN e) {
                    rta += e.getMessage();
                    HashMap<Integer, String> auxMap = new HashMap<>();
                    auxMap.put(registroEntry.getKey(), barrio);
                    guardarArchivoUrgente("urgente.dat", auxMap);
                }

            }

        }


        return rta;

    }


    public void guardarArchivoUrgente(String nombreArchi, HashMap<Integer, String> auxMap) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Iterator<Map.Entry<Integer, String>> entryIterator = auxMap.entrySet().iterator();
        try {
            fileOutputStream = new FileOutputStream(nombreArchi);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            while (entryIterator.hasNext()) {
                Map.Entry<Integer, String> entry = entryIterator.next();
                objectOutputStream.writeInt(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public void leerArchiUrgente(String nombreArchi, HashMap<Integer, String> auxMap) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;


        try {
            fileInputStream = new FileInputStream(nombreArchi);
            objectInputStream = new ObjectInputStream(fileInputStream);

            boolean finDeArchivo = false;
            while (!finDeArchivo) {
                try {
                    int nroTest = objectInputStream.readInt();
                    String barrio = (String) objectInputStream.readObject();
                    auxMap.put(nroTest, barrio);
                } catch (EOFException e) {
                    finDeArchivo = true;
                }
            }

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void javaAJson(){
        JSONObject joTotal = new JSONObject();
        JSONArray jaSano = new JSONArray();
        JSONArray jaAislar = new JSONArray();
        Iterator<Persona> personaIterator = personas.iterator();
        while (personaIterator.hasNext()){
            Persona aux= personaIterator.next();
            JSONObject joSano= new JSONObject();
            try {
                joSano.put("nombre", aux.getNombre());
                joSano.put("apellido", aux.getApellido());
                joSano.put("dni", aux.getDni());
                joSano.put("edad", aux.getEdad());
                joSano.put("barrio", aux.getBarrio());
                joSano.put("ocupacion", aux.getOcupacion());
                joSano.put("nroKit", aux.getNroKit());
                jaSano.put(joSano);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

        }
        Iterator<Map.Entry<Integer, Registro>> itMapa = registroHashMap.entrySet().iterator();
        while(itMapa.hasNext()){
            Map.Entry<Integer, Registro> registroEntry = itMapa.next();
            Registro aux= registroEntry.getValue();
            JSONObject joAislar = new JSONObject();
            try {
                joAislar.put("nroKit", registroEntry.getKey());
                joAislar.put("temperatura", aux.getTemperatura());
                String barrio= buscarBarrioDePersonaXDni(aux.getDni());
                joAislar.put("barrio", barrio);
                jaAislar.put(joAislar);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

        }

        try {
            joTotal.put("Persona", jaSano);
            joTotal.put("Registro", jaAislar);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        JsonUtiles.grabar(joTotal, "quilombo");

    }


    public String buscarDniPorNumeroKit(int nroKit){
        String dni = "";
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona aux = it.next();
            if (aux.getNroKit()==nroKit){
                dni = aux.getDni();
            }
        }
        return dni;
    }

    public void jsonAJava(String nombreArchivo){
        JSONObject jsonObject = null;
        JSONArray jaPersona = new JSONArray();
        JSONArray jaAislar = new JSONArray();
        try {
             jsonObject = new JSONObject(JsonUtiles.leer(nombreArchivo));

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        try {
            jaPersona= jsonObject.getJSONArray("Persona");
            jaAislar = jsonObject.getJSONArray("Registro");
            for(int i=0; i<jaPersona.length(); i++){
                JSONObject joPersona = jaPersona.getJSONObject(i);
                Persona aux= new Persona();
                aux.setBarrio(joPersona.getString("barrio"));
                aux.setNroKit(joPersona.getInt("nroKit"));
                aux.setApellido(joPersona.getString("apellido"));
                aux.setOcupacion(joPersona.getString("ocupacion"));
                aux.setNombre(joPersona.getString("nombre"));
                aux.setEdad(joPersona.getInt("edad"));
                aux.setDni(joPersona.getString("dni"));
                personas.addLast(aux);
            }

        } catch (JSONException e) {
           e.printStackTrace();
        }
        for(int i=0; i<jaAislar.length();i++){
            try {
                JSONObject joAislar= jaAislar.getJSONObject(i);
                Registro aux= new Registro();
                int nroKitAux= joAislar.getInt("nroKit");
                String dniAux= buscarDniPorNumeroKit(nroKitAux);
                aux.setDni(dniAux);
                aux.setTemperatura(joAislar.getDouble("temperatura"));
                registroHashMap.put(nroKitAux, aux);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }


    }


}
