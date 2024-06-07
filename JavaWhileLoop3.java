import java.util.*;

public class JavaWhileLoop3{

    public static void main(String args[])
    {
        // Program to print number from 1 to n //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range :");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range)
        {
            System.out.println(counter + "");
            counter++;
            sc.close();
        }
        System.out.println();
    
    }
}