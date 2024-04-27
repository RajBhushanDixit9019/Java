// java program to find odd or even number
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
        Scanner get=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=get.nextInt();

        if(num%2==0){
            System.out.println("The number "+num+" is even");
        }
        else{
            System.out.println("The number "+num+" is odd");
        }
        
        // got resourse leak erroe to fix it used close()..
        get.close();
    }
}
