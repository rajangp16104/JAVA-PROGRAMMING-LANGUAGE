import java.util.*;
public class JavaForLoop3{

    public static void main(String args[])
    {
        // Program to print Prime numbers to using for loop //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("n is Prime");
        }
        else
        {
            boolean isPrime = true;
            for(int i = 2; i<=n-1; i++)
            {
                if(n % i == 0)
                {
                    // n is multiple of i ( i is not equal to 1 or n) //
                    isPrime = false;
                }
            }
            if(isPrime == true)
            {
                System.out.println("n is Prime : ");
            }
            else{
                System.out.println(" n is not prime ");
            }
            sc.close();
        }  

        
    }

}