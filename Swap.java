package come.careerit.jsf.day1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbe:");
        int x=sc.nextInt();
        System.out.println("Enter the second number: ");
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping the value of x is "+x+" and the value osf y is "+y);
    }
}
