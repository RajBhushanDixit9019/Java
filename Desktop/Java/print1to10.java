public class print1to10 {
    public static void main(String[] args) {

        // for loop..
        System.out.println("Printing the numbers 1 to 10 using for loop:");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        // while loop..
        System.out.println("Printing the numbers 1 to 10 using while loop:");
        int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        // do while loop..
        System.out.println("Printing the numbers 1 to 10 using do while loop:");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);
    }
}
