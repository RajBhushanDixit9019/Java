package Loops;

import java.util.Scanner;
public class SumOfN{
    public static void main(String[] args) {
        System.out.println("Printing the sum of N natural numbers");

        // Object of Scanner Class to get inputs...
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n=getInput.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        System.out.println("Sum of "+n+" natural numbers is "+sum);

        // Getting resourse leak error to fix it uses close()..
        getInput.close();
    }
}