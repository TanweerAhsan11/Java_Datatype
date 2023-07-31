import java.util.Scanner;
public class primeFactorEfficient {

    public static void primeFactor(int num)
    {
        if(num<=1)
        {
            return;
        }
        for(int i=2;i*i<=num;i++)
        {
            while(num%i==0)
            {
                System.out.println(i);
                num=num/i;
            }
        }
        if(num>1)
        {
            System.out.println(num);
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        primeFactor(num);
    }
}
