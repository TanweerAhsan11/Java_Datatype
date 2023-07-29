import java.util.*;

class CountNumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int count=0;
        int a=s.nextInt();
        while(a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println(count);

    }
}
