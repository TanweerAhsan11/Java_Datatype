import java.util.Scanner;
public class TrailingZerosInFactorial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int trailZeros = 0;
/*      int fact=1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        while(fact%10 == 0)         // if last digit of factorial is zero we will count and repeat. 
        {
            // fact=fact%10;
            trailZeros++;
            fact=fact/10;
        }
*/ 
        // Effective way. 
        for(int i =5; i<=n;i=i*5)
        {
            trailZeros=trailZeros + n/i;
        }
        System.out.println(trailZeros);
    }
}

// NOTE :- This will not give appropriate solution for larger value > 12.
