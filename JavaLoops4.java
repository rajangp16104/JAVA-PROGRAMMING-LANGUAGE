import java.util.*;
public class JavaLoops4{

    public static void main(String args[])
    {
        // Program for multiplication of table using for loop // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}