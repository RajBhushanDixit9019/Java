import java.util.Scanner;
// java code to make a fucntion to return sum of two numbers.
public class Addition {
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        int x,y;

        System.out.println("Enter two number to get the sum:");
        x=get.nextInt();
        y=get.nextInt();

        // calling function
        int sum=add(x,y);
        System.out.println("Sum:"+sum);
        get.close();
    }
}
