import java.util.*;
public class JavaFuncMethod5
{
    // This is Java Method to calculate sum of digits of an integer in java //
    public static int sumDigits(int n)
    {
        int SumOfDigits = 0;
        while(n>0)
        {
            int LastDigit = n %10;
            SumOfDigits = SumOfDigits + LastDigit;
            n = n/10;

        }
        return SumOfDigits;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Integer : ");
        int Digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(Digits));
        sc.close();
    }
}