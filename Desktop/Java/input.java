import java.util.Scanner;

public class input {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // read name and age and display it
        System.out.print("Enter the name: ");
        String name=input.nextLine();
        
        System.out.print("Enter age:");
        int age=input.nextInt();

        // displaying the details
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
}
