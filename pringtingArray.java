import java.util.*;
import java.lang.*;
class printarr
{
    public static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(n);
    }

    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        print(arr,n);
    }
}