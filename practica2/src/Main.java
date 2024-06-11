import Modelo.Cliente;
import Modelo.MiExcepcion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1= new Cliente("carlos", "tevez", "11564645", "carlostevez@gmail.com", 39);
        Cliente cliente2= new Cliente("Roberto", "mouras", "156754345", "noseque@gmail.com", 68);
        Cliente cliente3= new Cliente("Chano", "TanBionica", "223456567", "dobloychoclo@gmail.com", 25);
        HashSet<Cliente> clientes= new HashSet<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        //pasar a JSON
        javaAJsonCliente(clientes);
        //System.out.println(JsonUtiles.leer("JSONCLIENTES"));
        clientes.remove(cliente1);
        clientes.remove(cliente2);
        clientes.remove(cliente3);
        try {
            jsonAJavaClientes("JSONCLIENTES", clientes);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
        System.out.println(clientes);
        javaAArchivo(clientes, "archivoClientes");
        clientes.remove(cliente1);
        clientes.remove(cliente2);
        clientes.remove(cliente3);
        try {
            archivoToJava("archivoClientes", clientes);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
        System.out.println(clientes);

    }

    public static void javaAJsonCliente(HashSet<Cliente> clientes){

        JSONArray jsonArray = new JSONArray();
        Iterator<Cliente> clienteIterator= clientes.iterator();
        while(clienteIterator.hasNext()){
            JSONObject jo = new JSONObject();
            Cliente aux= clienteIterator.next();
            try {
                jo.put("nombre", aux.getNombre());
                jo.put("apellido", aux.getApellido());
                jo.put("telefono", aux.getTelefono());
                jo.put("correo", aux.getCorreo());
                jo.put("edad", aux.getEdad());
            } catch (JSONException e){
                System.out.println(e.getMessage());
            }

            jsonArray.put(jo);

        }

        JsonUtiles.grabar(jsonArray, "JSONCLIENTES");


    }


    public static void jsonAJavaClientes(String nombreArchivo, HashSet<Cliente> clientes)  throws MiExcepcion{

        boolean añadido=true;
        try {
            JSONArray jsonArray = new JSONArray(JsonUtiles.leer(nombreArchivo));
            JSONObject jo = new JSONObject();

            for(int i=0; i<jsonArray.length(); i++) {
                jo = jsonArray.getJSONObject(i);
                Cliente cliente = new Cliente();
                cliente.setNombre(jo.getString("nombre"));
                cliente.setApellido(jo.getString("apellido"));
                cliente.setTelefono(jo.getString("telefono"));
                cliente.setCorreo(jo.getString("correo"));
                cliente.setEdad(jo.getInt("edad"));
                clientes.add(cliente);

            }
            if(clientes.isEmpty()){
                añadido=false;
            }

        } catch (JSONException e){
            System.out.println(e.getMessage());
        }
        if(!añadido){
            throw new MiExcepcion("No se añadio");
        }


    }


    public static void javaAArchivo(HashSet<Cliente> clientes, String nombreArchi){

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream= null;
        Iterator<Cliente> clienteIterator = clientes.iterator();
        try {
            fileOutputStream= new FileOutputStream(nombreArchi);
            objectOutputStream= new ObjectOutputStream(fileOutputStream);
            while(clienteIterator.hasNext()){
                Cliente aux= clienteIterator.next();
                objectOutputStream.writeObject(aux);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }


    public static void archivoToJava(String nombreArchivo, HashSet<Cliente> clientes) throws MiExcepcion {

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
             fileInputStream = new FileInputStream(nombreArchivo);
             objectInputStream = new ObjectInputStream(fileInputStream);
            boolean finalDeArchivo= false;
            while(!finalDeArchivo){
                try{
                    Cliente aux = (Cliente) objectInputStream.readObject();
                    clientes.add(aux);
                }catch(EOFException E){
                    finalDeArchivo=true;
                    System.out.println("Final del archivo ");
                }

            }


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new MiExcepcion("El archivo no se cerro");
            }
        }


    }








}