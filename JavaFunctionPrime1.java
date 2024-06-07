public class JavaFunctionPrime1
{
    public static boolean Isprime(int n)
    {
        if(n == 2)
        {
            return true;
        }
        boolean Isprime = true;
        for(int i = 2; i<=n-1; i++)
        {
            if(n % i == 0)
            {
                Isprime = false;
                return false ;
            }
        }
        return Isprime;
    }
    public static void main(String args[])
    {
        System.out.println(Isprime(12));
    }
}