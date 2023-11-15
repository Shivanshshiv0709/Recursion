package Video2;

public class printfromnto1
{
    public static void printName(int i,int n)
    {
        if(i<1)
            return;

        System.out.println(i);
        i--;
        printName(i,n);
    }
    public static void main(String args[])
    {
        int n=10;
        printName(n,n);
    }
}
