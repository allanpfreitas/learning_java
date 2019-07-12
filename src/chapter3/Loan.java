package chapter3;

/*
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.

*/

import java.util.Scanner;

public class Loan {

    public static void main (String args[]){

        int salary = 30000;
        int jobYears = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many you make at a year: ");
        double salaryYear = scanner.nextDouble();

        System.out.println("How long are you working on your current job ? ");
        double years = scanner.nextDouble();

        scanner.close();

        if (salaryYear >= salary) {

            if (years >= jobYears) {
                System.out.println("CONGRATS!! loan is granted!");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job " + jobYears + " years.");
            }
        }else {
            System.out.println("Sorry, you must earn at least $" + salary + " to qualify for the loan");
        }
    }
}
