import java.util.*;
public class primeFactors {

    public static boolean isPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        if(num==2 || num==3)
        {
            return true;
        }
        if(num%2==0 || num%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=num;i=i+6)
        {
            if(num%i==0 || num%(1+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primeFactors(int num)
    {
        for(int i=2;i<num;i++)                      // O(n)
        {
            if(isPrime(i))
            {
                int x=i;
                while(num%x==0)     //wo prime v hai or num ko totally divide v kar raha hain to num ka prime factor hoga.
                {
                    System.out.print(i + " ");
                    x=x*i;                          // O(logn)
                }
            }
        }
    }           // Total time complexity = O(nlogn).

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        isPrime(num);
        primeFactors(num);
    }
}
