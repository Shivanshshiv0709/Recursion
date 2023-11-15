package Video3;

public class sum1ton
{
    public static int sum(int n)
    {
        if(n<1)
            return 0;

        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        System.out.println("Sum  is: " +sum(10));
    }
}
