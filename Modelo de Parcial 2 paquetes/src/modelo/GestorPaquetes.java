package modelo;

import java.util.ArrayList;

public class GestorPaquetes {
//atributos
private ArrayList<Paquete> paquetes;
//constructores
    public GestorPaquetes() {
        paquetes = new ArrayList();
    }
    public GestorPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    //getters


    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }


    //metodos


    @Override
    public String toString() {
        String texto="";
        for(int i=0; i<paquetes.size(); i++){
            texto+=paquetes.get(i).toString()+"\n";
        }

        return texto;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof GestorPaquetes){
                GestorPaquetes aux= (GestorPaquetes)obj;
                if(aux.paquetes.equals(paquetes)){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }

    public int cantPaquetes(){
        return paquetes.size();
    }

    public void agregarPaquetes(Paquete aux){
        paquetes.add(aux);

    }


}
