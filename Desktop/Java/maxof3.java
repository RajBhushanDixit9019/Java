import java.util.Scanner;

public class maxof3 {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);

        System.out.println("Enter the three number:");
        int a=get.nextInt();
        int b=get.nextInt();
        int c=get.nextInt();
        int max;
        if(a>b){
            if(a<c){
                max=a;
            }
            else{
                max=c;
            }
        }
        else if(b>c){
            max=b;
        }
        else{
            max=c;
        }

        // output
        System.out.print("Largest among "+a+" "+b+" "+c+" is "+max);


        // got resource leak error to fix it used close()...
        get.close();
    }
}
