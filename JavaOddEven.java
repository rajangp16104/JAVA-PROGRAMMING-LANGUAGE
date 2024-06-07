import java.util.*;
public class JavaOddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0)
        {
            System.out.println("A is Even");

        }
        else{
            System.out.println("A is Odd");
        }
        sc.close();


    }
}