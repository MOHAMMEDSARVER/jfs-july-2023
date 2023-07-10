package come.careerit.jsf.day1;

import java.util.Scanner;

public class EmiCalculator {
    //program to calculate EMI
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total amount:");
        double amount=sc.nextDouble();
        System.out.println("Enter Rate Of Interest: ");
        double rateofinterest=sc.nextDouble();
        System.out.println("Enter Durtoin:");
        int months=sc.nextInt();

        double r=rateofinterest/(12*100);

        double emi=(amount*r*Math.pow(1+r,months))/(Math.pow(1+r,months)-1);
        System.out.println(emi);
        
    }
}
