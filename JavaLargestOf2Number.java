import java.util.*;
public class JavaLargestOf2Number{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println("A is greater Than B");

        }
        else
        {
            System.out.println("B is greater than A");

        }
        sc.close();
    }

}