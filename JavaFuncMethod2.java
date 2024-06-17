import java.util.*;
public class JavaFuncMethod2
{
    // Method/Function in Java To print Even and Odd num //
    public static boolean isEven(int number)
    {
    if(number % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an Integer : ");
        num = sc.nextInt();
        if(isEven(num))
        {
            System.out.println("Number is Even");

        }
        else
        {
            System.out.println("Number is Odd ");
        }
        sc.close();

    }
}