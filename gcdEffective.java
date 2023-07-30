import java.util.Scanner;

public class gcdEffective {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);;
        int a=s.nextInt();
        int b=s.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        System.out.println(a);
    }
}

/*
 *  a=12 b=15   b>a --> b-a
 *  a=12 b=3    a>b --> a-b
 *  a=9  b=3    a>b --> a-b
 *  a=6  b=3    a>b --> a-b
 *  a=3  b=3    a==b return a=3
 */