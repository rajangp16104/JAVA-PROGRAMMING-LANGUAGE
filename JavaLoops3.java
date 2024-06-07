import java.util.*;
public class JavaLoops3{

    public static void main(String args[])
    {
        // This Program is to print factorial of a number using for loop //
        int number;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Factorial number :");
        number = sc.nextInt();
        for(int i=1; i<=number; i++)
        {
             fact *= i;
             
        }
        System.out.println("Factorial : " + fact);
        sc.close();
    }
}