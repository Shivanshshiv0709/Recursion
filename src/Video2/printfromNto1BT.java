package Video2;

public class printfromNto1BT
{
    public static void printName(int i,int n)
    {
        if(i>=n)
            return;

        i++;
        printName(i,n);
        System.out.println(i);
    }
    public static void main(String args[])
    {
        int n=10;
        printName(1,n);
        System.out.println("1");
    }
}
