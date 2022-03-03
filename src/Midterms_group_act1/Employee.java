package Midterms_group_act1;

public class Employee extends Person {
    private static int numberOfEmployees = 0;
    private String employeeStatus;
    private float annualSalary;
    private int yearStarted;
    private int idNum;

    public Employee() {
        //For instantiating Employee class without adding new data
    }

    public Employee(String name, float annualSalary, int yearStarted, int idNum, String employeeStatus) {
        super(name);
        
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.idNum = idNum;
        this.employeeStatus = employeeStatus;

        numberOfEmployees++;
    }

    public void print(){
        System.out.println("Employee's data:");
        System.out.println("\tEmployee's name: " + this.getName() + "\n\tAnnual salary: "+ this.annualSalary +
                "\n\tYear started to work: "+ this.yearStarted + "\n\tCompany id number: "+ this.idNum +
                "\n\tStatus: " + this.employeeStatus);
    }
    
    public void setAnnualSalary(int annualSalary){
        this.annualSalary = annualSalary;
    }

    public float getAnnualSalary(){
        return this.annualSalary;
    }

    public void setYearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }

    public int getYearStarted(){
        return this.yearStarted;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getIdNum() {
        return this.idNum;
    }

    public String getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
