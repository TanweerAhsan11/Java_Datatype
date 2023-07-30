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
            return gcd(b,a%b);    //a%b will always less than b since it will give remainder.
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

/*
    gcd(10,15)         // gcd(a,b)
    gcd(15,10)        // gcd(b,a%b)
    gcd(10,5)        // gcd(b,a%b)
    gcd(5,0)        // b==0 return a = 5
    
*/
