package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Autor implements Serializable {
    //atributos
    private String id;
    private boolean isActive;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private int age;
    private ArrayList<String> tags;
    private ArrayList<Friend> friends;

    //Constructores


    public Autor(String id, boolean isActive, String balance, String eyeColor, String name, String gender, int age) {
        this.id = id;
        this.isActive = isActive;
        this.balance = balance;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.age = age;
        tags=new ArrayList<>();
        friends= new ArrayList<>();
    }

    public Autor(){
        id="";
        isActive=true;
        balance="";
        eyeColor="";
        name="";
        gender="";
        age=0;
        tags=new ArrayList<>();
        friends=new ArrayList<>();

    }

    //getters


    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public String getBalance() {
        return balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    //setters


    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }



    //metodos

    public void agregarTag(String tag){
        tags.add(tag);

    }

    public void agregarFriend(Friend friend){
        friends.add(friend);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tags=" + tags +
                ", friends=" + friends +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales=false;
        if(obj!=null){
            if(obj instanceof Autor){
                Autor aux=(Autor) obj;
                if(aux.name.equalsIgnoreCase(name) && aux.id.equalsIgnoreCase(id)){
                    sonIguales=true;
                }
            }
        }

        return sonIguales;
    }




}
