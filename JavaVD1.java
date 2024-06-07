import java.util.*;
public class JavaVD1{

    public static void main(String args[])
    { 
        // This program is to calculate average of three numbers //
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = (a + b + c)/3;
        System.out.println(" Average of Three Numbers is :" + average);
        sc.close();


    }
}

