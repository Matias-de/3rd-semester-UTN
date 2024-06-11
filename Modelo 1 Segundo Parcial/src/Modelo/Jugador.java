package Modelo;

import java.io.Serializable;
import java.util.UUID;

public class Jugador implements Serializable {
    //atributos
    private String id;
    private String guid;
    private boolean isActive;
    private String balance;
    private int age;
    private String eyeColor;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;

    //constructores


    public Jugador() {
        id="";
        guid="";
        isActive=false;
        balance="";
        age=0;
        eyeColor ="";
        firstName ="";
        lastName="";
        email="";
        phone="";
        position="";


    }

    public Jugador(String id, String guid, boolean isActive, String balance, int age, String eyeColor, String firstName, String lastName, String email, String phone, String position) {
        this.id = id;
        this.guid = guid;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }


    //Getters


    public String getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public String getGuid() {
        return guid;
    }

    //setters


    public void setId(String id) {
        this.id = id;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGuid(String Guid){
        this.guid = Guid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //metodos


    @Override
    public String toString() {
        return "Jugador{" +
                "id='" + id + '\'' +
                ", guid='" + guid + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta=false;

        if(obj!=null){
            if(obj instanceof Jugador){
                Jugador aux= (Jugador)obj;
                if(aux.id.equalsIgnoreCase(id)&& aux.guid.equals(guid)&& aux.firstName.equalsIgnoreCase(firstName)&& aux.lastName.equalsIgnoreCase(lastName)){
                    rta=true;
                }
            }
        }


        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
