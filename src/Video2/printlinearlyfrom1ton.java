package Video2;

public class printlinearlyfrom1ton
{
    public static void printName(int i,int n)
    {
        if(i>n)
            return;

        System.out.println(i);
        i++;
        printName(i,n);
    }
    public static void main(String args[])
    {
        int n=10;
        printName(1,n);
    }
}
