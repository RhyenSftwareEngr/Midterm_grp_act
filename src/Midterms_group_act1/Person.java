package Midterms_group_act1;
import java.util.Scanner;
public class Person {
    static Scanner scanner = new Scanner(System.in);
    private String name;

    public Person(){
        this.name = "No name yet";
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println("Name:" + this.name);
    }
}
