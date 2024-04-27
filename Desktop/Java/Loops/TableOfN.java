package Loops;

// In this java code we are printing the table of N

import java.util.Scanner;
public class TableOfN {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        // input..
        System.out.println("Enter the value of N: ");
        int n=getInput.nextInt();


        // processing...
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" s= "+n*i);
        }

        // Getting resourse leak error to fix it used close()..
        getInput.close();
    }
}
