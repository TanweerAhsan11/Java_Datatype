import java.util.*;
public class primeNumber {
    public static boolean isPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        else{
/*             
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
*/
            // Effective way in O(root n)
             for(int i=2; i*i<=num ;i++)    // for 37 => when i=7 --> i*i=49 which is greater than num 37.Stop there.
            {
                if(num%i==0)
                {
                    return false;
                }
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
