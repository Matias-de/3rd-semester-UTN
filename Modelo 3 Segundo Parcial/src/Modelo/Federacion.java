package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Federacion {
    //atributos
    private String nombre;
    private String fechaDeFundacion;
    private int cantCopas;
    private ListaGenerica<Integrante> listaDeIntegrantes;


    //Constructor


    public Federacion(String nombre, String fechaDeFundacion, int cantCopas) {
        this.nombre = nombre;
        this.fechaDeFundacion = fechaDeFundacion;
        this.cantCopas = cantCopas;
        listaDeIntegrantes= new ListaGenerica<>();
    }

    //getters


    public String getNombre() {
        return nombre;
    }

    public int getCantCopas() {
        return cantCopas;
    }

    public ListaGenerica<Integrante> getListaDeIntegrantes() {
        return listaDeIntegrantes;
    }

    public String getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantCopas(int cantCopas) {
        this.cantCopas = cantCopas;
    }

    public void setFechaDeFundacion(String fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public void setListaDeIntegrantes(ListaGenerica<Integrante> listaDeIntegrantes) {
        this.listaDeIntegrantes = listaDeIntegrantes;
    }

    //metodos


    @Override
    public String toString() {
        return "Federacion{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeFundacion='" + fechaDeFundacion + '\'' +
                ", cantCopas=" + cantCopas +
                ", listaDeIntegrantes=" + listaDeIntegrantes.toString()+
                '}';
    }

    public void javaToJson(){
        JSONObject jo = new JSONObject();
        try {
            JSONArray jaIntegrantes = new JSONArray();
            for(int i=0; i<listaDeIntegrantes.lenght(); i++){
                JSONObject joIntegrantes = new JSONObject();
                Integrante aux= listaDeIntegrantes.get(i);
                joIntegrantes.put("nombre", aux.getNombre());
                joIntegrantes.put("apellido", aux.getApellido());
                joIntegrantes.put("edad", aux.getEdad());
                if(aux instanceof Futbolista){
                    Futbolista futbolista = (Futbolista) aux;
                    joIntegrantes.put("nroCamiseta", futbolista.getNroCamiseta());
                    joIntegrantes.put("puesto", futbolista.getPuesto());
                    joIntegrantes.put("tipoIntegrante", "Futbolista");

                }else if(aux instanceof Entrenador){
                    Entrenador entrenador = (Entrenador) aux;
                    joIntegrantes.put("sistemaDeJuego", entrenador.getSistemaDeJuego());
                    joIntegrantes.put("estiloDeJuego", entrenador.getEstiloDeJuego());
                    joIntegrantes.put("tipoIntegrante", "Entrenador");


                }else if(aux instanceof AyudanteDeCampo){
                    AyudanteDeCampo ayudante = (AyudanteDeCampo) aux;
                    joIntegrantes.put("metodologia", ayudante.getMetodologia());
                    joIntegrantes.put("tipoIntegrante", "AyudanteDeCampo");

                }else if(aux instanceof Masajista){
                    Masajista masajista = (Masajista) aux;
                    joIntegrantes.put("titulo", masajista.getTitulo());
                    joIntegrantes.put("añosXP", masajista.getAñosDeExperiencia());
                    joIntegrantes.put("tipoIntegrante", "Masajista");

                }
                JSONObject joInt = new JSONObject();
                jaIntegrantes.put(joIntegrantes);
                jo.put("Integrantes", jaIntegrantes);
            }
            jo.put("nombre", nombre);
            jo.put("fechaDeFundacion", fechaDeFundacion);
            jo.put("cantidadCopas", cantCopas);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonUtiles.grabar(jo, "Federacion");
    }


}
