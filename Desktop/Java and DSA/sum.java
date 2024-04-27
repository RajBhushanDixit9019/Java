import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        try (// input object
        Scanner in = new Scanner(System.in)) {
            // reading two number
            System.out.print("Enter the first number:");
            int a=in.nextInt();

            System.out.print("Enter the secound number:");
            int b=in.nextInt();

            // calc: adding two number
            int sum=a+b;

            // output 
            System.out.print("Sum of "+a+" and "+b+" is "+sum);
        }


    }
}
