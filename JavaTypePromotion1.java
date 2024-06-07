public class JavaTypePromotion1{

    public static void main(String args[])
    {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        // the below statement will only print a as it is //
        System.out.println(a);
        System.out.println(b-a);
    }

}