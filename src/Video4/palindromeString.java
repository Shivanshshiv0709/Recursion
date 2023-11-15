package Video4;

public class palindromeString
{
    public static boolean checkPalin(int i,String str,int length)
    {
        if(i>=length/2)
            return true;
        if(str.charAt(i)!=str.charAt(length-i-1))
            return false;

        return checkPalin(i+1,str,length);
    }

    public static void main(String[] args) {
        String str="MADAMA";
        System.out.println("The String : "+str +" is Palindrome: " +checkPalin(0,str,str.length()));
    }
}
