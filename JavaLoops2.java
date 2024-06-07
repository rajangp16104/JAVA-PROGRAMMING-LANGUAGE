import java.util.*;
public class JavaLoops2{

    public static void main(String args[])
    {
        // Program to input the set of integrs and print their sum of even and odd numbers // 
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.println("Enter the number :");
            number = sc.nextInt();

            if(number % 2 == 0)
            {
                evensum += number;
            }
            else
            {
                oddsum += number ;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();
            sc.close();

        }while(choice == 1);

        System.out.println("Sum of even Numbers :" + evensum);
        System.out.println("Sum of odd Numbers :" + oddsum);
    }
}