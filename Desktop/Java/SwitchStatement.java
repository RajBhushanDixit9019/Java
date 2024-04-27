import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
      Scanner get=new Scanner(System.in);

      System.out.println("Enter the day number:");
      int day=get.nextInt();
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
      }

      // got resourse leak erroe to fix it used close()..
      get.close();
    }
  }
  