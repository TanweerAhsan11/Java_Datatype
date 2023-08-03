import java.util.*;
public class powerEffective {
    
    public static int powerEfficient(int num,int pow)       //O(logn)
    {
        if(pow==0)
        {
            return 1;
        }
        int temp=powerEfficient(num,pow/2);
        temp=temp*temp;
        if(pow%2==0)
        {
            return temp;
        }
        else{
            return temp*num;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pow=s.nextInt();
        int c=powerEfficient(num,pow);
        System.out.println(c);
    }
}
