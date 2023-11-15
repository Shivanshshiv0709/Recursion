package Video2;

public class printlinearlyfrom1tonBT
{
    public static void printName(int i,int n)
    {
        if(i<=1)
            return;
        i--;
        printName(i,n);
        System.out.println(i);
    }
    public static void main(String args[])
    {
        int n=10;
        printName(n,n);
        System.out.println(n);
    }
}
