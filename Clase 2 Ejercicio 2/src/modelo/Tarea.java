package modelo;

public class Tarea {

    //atributos

    private String descripcion;

    private int importancia; //1 mas importante, 5 menos importante

    private int vencimiento; // en cuantos dias vence

    //constructores

    public Tarea(){
        descripcion="INDEFINIDO";
        importancia=0;
        vencimiento=0;

    }

    public Tarea(String pDescripcion, int pVencimiento, int pImportancia){

        descripcion=pDescripcion;
        vencimiento=pVencimiento;
        importancia=pImportancia;

    }

    //getters


    public int getImportancia() {
        return importancia;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //setters


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    //metodos

    public String getInfo(){
        return "\nImportancia de tarea: "+importancia+"\n Descripcion: "+descripcion+"\n dias restantes: "+vencimiento;

    }



}
