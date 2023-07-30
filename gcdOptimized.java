import java.util.Scanner;
public class gcdOptimized {

    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=gcd(a, b);
        System.out.println(c);
    }
}
