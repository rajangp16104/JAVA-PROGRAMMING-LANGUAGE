public class JavaTypePromotion3{

    public static void main(String args[])
    {
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte)(a + b + c);
        // byte bt =(a + b + c); This will be loossy conversion hence Java will note promote conversion from int to byte//
        System.out.println((byte)(bt));

    }
}