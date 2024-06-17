import java.util.*;
public class JavaFuncMethod3
{
    // This is a program for palindrome in java //
    public static boolean isPalindrome(int number)
    {
        int palindrome = number;
        int reverse = 0;
        while(palindrome != 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome / 10;
        }
        // If Original number and reverse number is equal means //
        // number is palindrome in Java //
        if(number == reverse)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome))
        {
            System.out.println("Number is : " +palindrome +"is palindrome");
        }
        else{
            System.out.println("Number is : " +palindrome +"is not a palindrome");
        }
        sc.close();
    }
}