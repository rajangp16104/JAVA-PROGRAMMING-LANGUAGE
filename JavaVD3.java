import java.util.*;
public class JavaVD3{

    public static void main(String args[])
    {
        // Bill Of Items//
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total1 = pencil + pen + eraser;
        float total2 = total1 + (0.18f*total1);
        // Total without GST//
        System.out.println("The total of Three Items is :" + total1);
        // Total with GST
        System.out.println("Bill with GST is : " + total2);
        sc.close();

    }
}