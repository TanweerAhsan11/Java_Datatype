public class recursiveInvereseInteger {

    public static void printNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
    public static void main(String args[])
    {
        int n=4;
        printNumber(n);
    }
}
