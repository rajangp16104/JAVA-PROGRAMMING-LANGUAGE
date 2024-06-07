import java.util.*;
public class JavaWhileLoop4
{
    public static void main(String args[])
    {
        // Program to print Sum of N Natural Numbers // 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while( i <= n)
        {
            sum = sum + i;
            i++;
            sc.close();
        }
        System.out.println("Sum is : " + sum);

    }
}