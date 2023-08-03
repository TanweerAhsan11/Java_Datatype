import java.util.*;
public class powerIterative {

    public static int powerEffective(int num,int pow)       //O(logn)
    {
        int res=1;
        while(pow>0)
        {
            if(pow%2!=0)
            {
                res=res*num;
            }
            num=num*num;
            pow=pow/2;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pow=s.nextInt();
        int c=powerEffective(num,pow);
        System.out.println(c);
    }
}
