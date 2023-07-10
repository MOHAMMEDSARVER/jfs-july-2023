package come.careerit.jsf.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        //Write a program to accept two numbers from the user and find their sum and average.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");


        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();

        int sum=num1+num2;

        System.out.println("The sum of two numbers is "+sum);
        System.out.println("The average of two numbers is"+sum/2);
    }
}
