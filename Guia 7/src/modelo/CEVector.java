package modelo;

import Interfaces.IMetodos;

import java.util.Collections;
import java.util.Objects;
import java.util.Vector;

public class CEVector implements IMetodos{
   Vector<Integer> vector;


   public CEVector(){
       vector = new Vector<>();
   }

   public CEVector(Vector<Integer> v){
       vector=v;
   }


    public Vector<Integer> getVector() {
        return vector;
    }







    @Override
    public int hashCode() {
        return 1;
        
    }

    @Override
    public void agregar(int num) {
        vector.add(num);
    }

    @Override
    public void eliminar(int num) {
        vector.removeElement(num);
    }

    @Override
    public String buscar(int num) {
        String rta="numero a buscar no encontrado"+"("+num+")";
        for(int i=0;i<vector.size(); i++){
            if(vector.get(i).equals(num)){
                rta="encontrado: "+vector.get(i);
            }
        }

        return rta;
    }

    @Override
    public String listar() {
        String texto="";
        for(int i=0; i<vector.size();i++){
            texto+="\nNUMERO: "+vector.get(i).toString();
        }


        return texto;

    }

    @Override
    public int contar() {
        return vector.size();
    }

    @Override
    public boolean equals(Object obj) {
       boolean sonIguales=false;
       if(obj!=null){
           if(obj instanceof CEVector){
               CEVector aux = (CEVector)obj;
               if(aux.vector.equals(vector)){
                   sonIguales=true;
               }
           }
       }



       return sonIguales;
    }
}
