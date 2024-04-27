
import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
    

        int i,j;
        int min=1,max=6;
        System.out.println("Pattern : Square Hollow Pattern:");
        /* 
        ***** 
        *   *
        *   *
        *   *
        *   *
        *****
        */

        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print("*");  
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        get.close();
    }
}
