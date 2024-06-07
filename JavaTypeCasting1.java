import java.util.*;
public class JavaTypeCasting1{

    public static void main(String args[])
    {
        // here flaot data is converted into int by type casting //
        
        Scanner sc = new Scanner(System.in);
        float a = 25.999f;
        int b = (int) a;
        System.out.println(b);
        sc.close();
    }
}