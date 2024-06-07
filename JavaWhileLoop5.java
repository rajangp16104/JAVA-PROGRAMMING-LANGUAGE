public class JavaWhileLoop5
{
    public static void main(String args[])
    {
        // Program to print Reverse of a Number using while loop //
        int n = 10899;
        while(n>0)
        {
            int LastDigit = n%10;
            System.out.print(LastDigit + "");
            n = n/10;
        }
    }
}