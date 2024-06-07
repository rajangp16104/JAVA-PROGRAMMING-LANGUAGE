public class JavaWhileLoop6
{
    public static void main(String args[])
    {
        // Program to print the reverse the given number (Logic 2) //
        int n = 10899;
        int rev = 0;
        while(n>0)
        {
            int LastDigit = n%10;
            rev = (rev*10) + LastDigit;
            n =n/10;
        }
        System.out.println(rev);
    
        
    }
}