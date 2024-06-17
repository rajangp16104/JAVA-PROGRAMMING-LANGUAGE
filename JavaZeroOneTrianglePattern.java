public class JavaZeroOneTrianglePattern
{
    public static void zero_one_triangle(int n)
    {
        // outer loop //
        for(int i = 1; i<=n; i++)
        {
            // for printing 1 //
            for(int j = 1; j<=i; j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print("1");
                }
                // for printing 0 // 
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        zero_one_triangle(5);
    }
}