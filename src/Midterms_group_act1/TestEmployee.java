package Midterms_group_act1;
import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] workers;

        Employee fetch_Employee = new Employee();


        System.out.print("How many Employees you want to check?");
        workers = new Employee[Integer.parseInt(scanner.nextLine())];

        for (int count = 0; count < workers.length; count++) {
            System.out.println(String.format("Enter credentials for Employee %d", count + 1));


            System.out.print("Enter company Id: ");
            fetch_Employee.setId_num(Integer.parseInt(scanner.nextLine()));

            System.out.print("Enter Employee name ");
            fetch_Employee.setName(scanner.nextLine());

            System.out.print("Enter Annual Salary ");
            fetch_Employee.setAnnual_salary(Integer.parseInt(scanner.nextLine()));

            System.out.print("Enter Year started ");
            fetch_Employee.setYear_started(Integer.parseInt(scanner.nextLine()));

//            fetch_Employee.print();
        }


    }

}

