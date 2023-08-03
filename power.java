import java.util.*;
public class power {
    
    public static void NaivePowerResult(int num,int pow)        //O(n)
    {
        int res=1;
        for(int i=0;i<pow;i++)
        {
            res=res*num;
        }
        System.out.println(res);

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int num=s.nextInt();
        int pow=s.nextInt();
        NaivePowerResult(num,pow);

    }
}
