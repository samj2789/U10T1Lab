public class WarmUp
{
    public static void main(String[] arg)
    {
        System.out.println(factorial(5));
    }

    public static int factorial(int num)
    {
        int factorial = 1;
        for (int i = num; i >= 1; i--)
        {
            factorial *= i;
        }
        return factorial;
    }
}
