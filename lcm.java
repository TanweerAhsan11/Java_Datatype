import java.util.*;
public class lcm {

    public static int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        else{
            return gcd(b,a%b);
        }

    }

    public static int lcm(int a , int b)
    {
        return (a*b)/gcd(a,b);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
/*
        int lcm=Math.max(a,b);
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
            {
                System.out.println(lcm);
                lcm++;
            }

        }
*/
        //  Effective way using formula =>  (a*b) = lcm(a,b) * gcd(a,b); 
        gcd(a,b);
        int c = lcm(a,b);
        System.out.println (c);

    }
}
