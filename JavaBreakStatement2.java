import java.util.*;

public class JavaBreakStatement2{

    public static void main(String args[])
    {
        // keeping entering numbers till user enters a multiple of 10 //
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("Enter Your Number");
            int n = sc.nextInt();
            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
            sc.close();
        }while(true);

    }
}

