public class JavaBreakStatement1{

    public static void main(String args[])
    {
        // program for break statement // 
        for(int i = 1; i<=3; i++)
        {
            if(i == 3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the Loop");
    }
}