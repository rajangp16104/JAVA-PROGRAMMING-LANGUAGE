import java.util.*;

public class JavaFunctionParameter1
{

    public static void calculateSum()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is ;" + sum);
        sc.close();

        
    }
    public static void main(String args[])
    {
        calculateSum();
        
    }
}