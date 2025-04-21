package Recursionpack1;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fibh(4));
    }

    public static int fibh(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        return fibh(n-1)+fibh(n-2);
    }
}
