package Midterms_group_act1;
import java.util.Scanner;
public class Person {
    static Scanner scanner = new Scanner(System.in);
    private String name;

    public Person(){
        name = "No name yet";
    }
    public Person(String n){
        name = n;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("Name:" + name);
    }
}
