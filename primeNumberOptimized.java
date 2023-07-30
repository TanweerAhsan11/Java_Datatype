import java.util.*;
public class primeNumberOptimized {
    public static boolean isPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        if(num%2==0 || num%3==0)
        {
            return false;
        }
        for(int i=5; i*i<=num ;i=i+6)
        {
            if(num%i==0 || num%(i+2)==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean c = isPrime(num);
        System.out.println(c);

    }
}
