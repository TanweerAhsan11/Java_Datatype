import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args)
    {
        int reverse = 0;
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int temp=a;
        while(a!=0)
        {
            int lastDigit = a%10;
            reverse = reverse*10 + lastDigit;
            a=a/10;
        }
        // System.out.println("reverse = " +reverse + "a="+temp);
       
        if(reverse==temp)
        {
            System.out.println("TRUE, Given Number is palindrome");
        }
        else
        {
            System.out.println("FALSE, Given number is not palindrome");
        }
        
    }
}
