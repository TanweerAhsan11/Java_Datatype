import java.util.Scanner;
public class allDivisorOfNumber {

/*   public static void naiveMethod(int num)         // O(n)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
*/

    public static void effectiveMethod(int num)         // O(root n)
    {
        int i;
        for(i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i + " ");
            }
        }
        for( ;i>=1;i--)
        {
            if(num%i==0)
            {
                System.out.print(num/i + " ");
            }
        }
    }                
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        // naiveMethod(num);
        effectiveMethod(num);
    }
}
