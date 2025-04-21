package Recursionpack1;

import java.util.Scanner;

public class checktheekemtnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        int target= scanner.nextInt();
        boolean ans=checkert(arr,target);
        System.out.println(ans);
    }
    public static boolean checkert(int arr[], int startindex, int target)
    {
        if(startindex==arr.length)
        {
            return false;
        }
        if(arr[startindex]==target)
        {
            return true;
        }
        return checkert(arr,startindex+1,target);
    }
    public static boolean checkert(int arr[], int target)
    {
        return checkert(arr,0,target);
    }
}
