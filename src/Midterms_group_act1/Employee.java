package Midterms_group_act1;
import java.util.Scanner;
public class Employee extends Person {
    String employees_name;
    int annual_salary;
    int year_started;
    int id_num;

    //Logic

    public void print(){
        System.out.println("Employee's data:");
        System.out.println("Employee's name:" + this.employees_name + "\n\b Annual salary:"+ this.annual_salary +
                "\n\bYear started to work:"+ this.year_started + "\n\bCompany id number: "+ this.id_num);
    }

    public void setName(String employees_name){
        this.employees_name = employees_name;
    }
    public String getName(){
        return this.employees_name;
    }
    public void setAnnual_salary(int annual_salary){
        this.annual_salary = annual_salary;
    }
    public int getAnnual_salary(){
        return annual_salary;
    }
    public void setYear_started(int year_started){
        this.year_started = year_started;
    }
    public int getYear_started(){
        return getYear_started();
    }

    public void setId_num(int id_num) {
        this.id_num = id_num;
    }
    public int getId_num() {
        return id_num;
    }
}
