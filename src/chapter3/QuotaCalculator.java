package chapter3;

/*

IF ELSE
All Salesperson are expected to make at least 10 sales each week.

for those who do, they receive a congratulory message

For those who don't, they are informed of how many sales they were short.

 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main (String args[]){

        int quota = 10;

        System.out.println("How many sales did this week ? ");
        Scanner scanner = new Scanner(System.in);
        int weekSales = scanner.nextInt();
        scanner.close();

        if (weekSales >= quota)
            System.out.println("WELL DONE! KEEP DOING THIS GREAT JOB");
        else {
            int salesShort = quota - weekSales;
            System.out.println("You were short of: " + salesShort + " sale(s)");
        }
    }

}
