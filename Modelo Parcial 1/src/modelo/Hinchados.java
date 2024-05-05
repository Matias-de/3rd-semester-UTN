package modelo;

import Interfaces.IAdicionalZombie;
import Interfaces.IZombie;

public class Hinchados extends Personajes implements IAdicionalZombie, IZombie {
    //atributos
    private int cantHinchazon;

    //constructores

    public Hinchados(){
        super();
        cantHinchazon = 0;

    }

    public Hinchados(int posX, int posY,String nombre, String skin, double nivelDeVida, String armas, int cantHinchazon) {
        super(posX, posY,nombre, skin, nivelDeVida, armas);
        this.cantHinchazon = cantHinchazon;

    }

    //getters


    public int getCantHinchazon() {
        return cantHinchazon;
    }

    //metodos

    @Override
    public String camuflarse() {

        return "El enemigo se ha camuflado";
    }

    @Override
    public String atacar() {
        return "Hinchado ha atacado!";
    }

    @Override
    public String defenderse() {
        return "Hinchado no se ha podido defender (esta gordito :()";
    }

    @Override
    public String morir() {
        nivelDeVida=0;
        return "Hinchado ha muerto";
    }

    @Override
    public String cargarEnergia() {
        return "Hinchado ha comido un brazo humano y ha recuperado su energia!";
    }

    @Override
    public String morder() {
        return "Hinchado uso morder, esta gordito asique mordio bastante";
    }

    @Override
    public String toString() {
        return super.toString()+"Hinchados{" +
                "cantHinchazon=" + cantHinchazon +
                '}';
    }
}
