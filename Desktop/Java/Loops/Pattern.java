

// In this java code is to print multiple patterns using loops

import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args) {
        Scanner getIn=new Scanner(System.in);

        int i,j;
        System.out.println("Pattern 1:Solid rectangle");

        /* 
         *****
         *****
         *****
         *****
        */ 
        
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        

        getIn.close();
    }
}

