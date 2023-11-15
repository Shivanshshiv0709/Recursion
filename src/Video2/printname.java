package Video2;
// print name 5 times
public class printname
{
    public static void printName(int count,int n)
    {
        if(count>n)
            return;

        System.out.println("Name ");
        count++;
        printName(count,n);
    }
    public static void main(String args[])
    {
        printName(1,5);
    }
}
