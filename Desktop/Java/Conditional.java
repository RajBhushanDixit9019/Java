// this java code is ti read the age and tell that the person is adult or not
import java.util.*;
public class Conditional {
  public static void main(String[] args) {
    // Input object
    Scanner get=new Scanner(System.in);

    // reading age
    System.out.print("Enter the age of person:");
    int age=get.nextInt();

    // computing the output
    if(age>=18){
      System.out.println("Person is adult.");
    }
    else{
      System.out.println("Person is not adult.");
    }
    
    // got resourse leak error to fix it used close()...
    get.close();
  }   
}
