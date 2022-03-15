package Midterms_group_act1;

import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees;
        int numberPermanent;
        String idNum;
        String name;
        float annualSalary;
        int yearStarted;

        Permanent[] pWorkers;
        Contractual[] cWorkers;

        System.out.print("How many Employees you want to check?");
        numberOfEmployees = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter amount of Permanent Employees: ");
        numberPermanent = Integer.parseInt(scanner.nextLine());
        pWorkers = new Permanent[numberPermanent];
        cWorkers = new Contractual[numberOfEmployees - numberPermanent];

        for (int count = 0; count < numberOfEmployees; count++) {

            if (count < numberPermanent)
                System.out.printf("\nEnter credentials for Permanent Employee %d%n", count + 1);
            else
                System.out.printf("\nEnter credentials for Contractual Employee %d%n", count + 1 - numberPermanent);

            System.out.print("\nEnter company ID: EMP");
            idNum = scanner.nextLine();
            while (idNum.length() != 3) {
                System.out.println("Invalid Value! Only type three digits.");
                System.out.print("\nEnter company ID: EMP");
                idNum = scanner.nextLine();
            }

            System.out.print("\nEnter employee name: ");
            name = scanner.nextLine();
//            name = "Test";

            System.out.print("\nEnter annual salary: ");
            annualSalary = Integer.parseInt(scanner.nextLine());
//            annualSalary = 123231.4F;

            System.out.print("\nEnter year started: ");
            yearStarted = Integer.parseInt(scanner.nextLine());
//            yearStarted = 1999;

            if (count < numberPermanent)
                pWorkers[count] = new Permanent(name, annualSalary, yearStarted, idNum, "Permanent");
            else
                cWorkers[count-numberPermanent] = new Contractual(name, annualSalary, yearStarted, idNum, "Contractual");
        }

        //Just for testing
        for (Permanent x:pWorkers) {
            x.print();
        }

        for (Contractual y:cWorkers) {
            y.print();
        }

        //Please add comments
    }
}

