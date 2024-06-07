public class JavaCallByValue1
{
    public static void main(String args[])
    {
        // swap - values exchange
        int a = 5;
        int b = 10;

        // swap 

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a is : " + a);
        System.out.println(" b is : " + b);
    }
}