package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String arg[]){
        //Algorithm - Problem we need to solve
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get hourly pay rate
        System.out.println("Now enter the hourly rate: ");
        double rate = scanner.nextDouble();
        scanner.close(); //after read all variables, close the scanner to release memory

        //3. Multiply hour and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee gross pay is $:" + grossPay);
    }
}
