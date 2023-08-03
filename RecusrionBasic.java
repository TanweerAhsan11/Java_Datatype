public class RecusrionBasic {
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
        fun(n-1);
    }
    public static void main(String args[])
    {
        fun(3);
    }
}

/*
 * main()
 *      fun(3)
 *          fun(2)
 *              fun(1)
 *                  fun(0)
 *                  1
 *                  fun(0)
 *              2
 *              fun(1)
 *                  fun(0)
 *                  1
 *                  fun(0)
 *      3
 *      fun(2)
 *          fun(1)
 *              fun(0)
 *              1
 *              fun(0)
 *          2
 *          fun(1)
 *              fun(0)
 *              1
 *              fun(0)
 *  
 */