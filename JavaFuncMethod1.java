import java.util.*;
public class JavaFuncMethod1
{
    // This Java Method to calculate average of three numbers //
    public static double average(double x, double y, double z)
    {
        return (x + y + z)/3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number :");
        double x = sc.nextDouble();
        System.out.print("Enter The Second Number :");
        double y = sc.nextDouble();
        System.out.print("Enter The Third Number :");
        double z = sc.nextDouble();
        System.out.println("The average Value is " + average(x, y, z));
        sc.close();
    }
}