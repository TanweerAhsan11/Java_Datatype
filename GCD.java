import java.util.*;

public class GCD {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int gcd=Math.min(a,b);
        while(gcd>0)
        {
            if(a%gcd==0 && b%gcd==0)
            {
                break;
            }
            gcd--;
        }
        System.out.println(gcd);
    }
}
