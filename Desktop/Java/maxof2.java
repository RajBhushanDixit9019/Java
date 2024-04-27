import java.util.Scanner;

public class maxof2 {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        
        System.out.println("Enter the two numbers: ");
        int num1=get.nextInt();
        int num2=get.nextInt();

        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }

        // got resource leak error to fix it used close()...
        get.close();
    }
}
