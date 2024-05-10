package modelo;

public class Juego extends Elemento{
    //atributos
    private double horasEstimadas;
    private String compania;
    //constructores

    public Juego(){
        super(0,"","","" );
        horasEstimadas = 10;
        compania = "";
    }

    public Juego(int id, String titulo, double horasEstimadas){
        super(0,titulo,"", "");
        this.horasEstimadas = horasEstimadas;
    }

    public Juego(int id, String titulo, String genero, String fechaRenta, double horasEstimadas, String compania){
        super(id, titulo,genero,fechaRenta);
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;

    }

    //getters


    public String getCompania() {
        return compania;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    //setters
    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString()+"Juego{" +
                "horasEstimadas=" + horasEstimadas +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=super.equals(obj);
       if(sonIguales){
           if(obj instanceof Juego){
               Juego aux = (Juego)obj;
               if(!aux.getCompania().equalsIgnoreCase(compania)){
                   sonIguales= false;
               }
           }
       }

        return sonIguales;
    }


    @Override
    public void entregar() {
        super.entregar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }

    @Override
    public boolean isEntregado() {
        return super.isEntregado();
    }

    @Override
    public void agregarFechaDeRenta(String fechaRenta) {
        super.setFechasDeRenta(fechaRenta);
    }


    @Override
    public int compareTo(Object obj) {
        int rta=0;
        if(obj!=null && obj instanceof Juego){
            Juego aux= (Juego)obj;
            if(aux.getHorasEstimadas() > horasEstimadas){
                rta=1;
            }else if(aux.getHorasEstimadas() < horasEstimadas){
                rta=-1;
            }
        }

            return rta;
    }
}
