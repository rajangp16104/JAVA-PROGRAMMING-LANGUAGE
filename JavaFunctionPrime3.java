public class JavaFunctionPrime3
{
    public static boolean Isprime(int n) // This Is Optimised method of Prime number //
    {
        if(n == 2)
        {
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
            
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n) // This is program to print range of prime numbers // 
    {
        for(int i = 2; i<=n; i++)
        {
            if(Isprime(i))
            {
                System.out.print(i + " ");
            }
            
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        primesInRange(100);
    }
}    