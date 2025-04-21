package Array;

import java.util.Scanner;

public class Findduplicate {
    public static void main(String[] args) {
    int arr[]=takeinput();
    int dup=getduplicate(arr);
        System.out.println(dup);
    }
    public static int[] takeinput()
    {
        System.out.println("Enter the Size of the array");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elemnts in the Array");
        for(int i=0;i<n;i++)
        {
            ar[i]= scanner.nextInt();
        }
        return ar;
    }
    public static void printarr(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static int getduplicate(int[]arr)
    {
        int answer=0;
        for(int i=0;i<arr.length;i++) {
            answer = answer ^ arr[i];
        }
        for(int i=0;i<arr.length-1;i++)
        {
            answer=answer^i;
        }
        return answer;
    }
}
