import java.util.*;


class SearchArray
{
    public static boolean linearSearch(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner (System.in);
        int key=s.nextInt();
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        if(linearSearch(arr,n,key))
        {
            System.out.println("Element present in the array.");
        }
        else
        {
            System.out.println("Element not present in the array.");
        }
    }
}