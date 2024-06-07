import java.util.*;

public class JavaConditional1{
    public static void main(String args[])
    {
        // Program to print Posotive And Negative Number //
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0)
        {
            System.out.println(" Number Is Positive :");
        }
        else if(number<0)
        {
            System.out.println(" Number is Negative ");
        }
        else
        {
            System.out.println("Number Is Neutral");
        }
        sc.close();

    }


}