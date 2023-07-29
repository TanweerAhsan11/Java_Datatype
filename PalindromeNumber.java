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
            int lastDigit = a%10;                // finding last digit
            reverse = reverse*10 + lastDigit;    //adding last digit to get reverse
            a=a/10;                              //removing last digit everytime so that we can get one decreased number.
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
