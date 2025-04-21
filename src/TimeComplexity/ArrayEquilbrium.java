package TimeComplexity;

import java.util.Scanner;

public class ArrayEquilbrium {
    public static void main(String[] args) {
    int arr[]=takeinput();
    int res=eqib(arr);
        System.out.println(res);
    }
    public static int []takeinput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static int eqib(int[]arr)
    {
        int rightsum=0;
        int leftsum=0;
        for(int i=0;i<arr.length;i++)
        {
            rightsum+=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            rightsum-=arr[j];
            if(leftsum==rightsum)
            {
                return j;
            }
            leftsum+=arr[j];
        }
        return -1;
    }
}
