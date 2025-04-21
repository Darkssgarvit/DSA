package Recursionpack1;

import java.util.Scanner;

public class sumofelem {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int startindex=1;
        int ans=sumofeleme(arr , startindex);
        System.out.println(ans);
    }
    public static int sumofeleme(int arr[], int startindex)
    {
        if(startindex==arr.length)
        {
            return 0;
        }
        return arr[startindex]+sumofeleme(arr,startindex+1);
    }
    public static int sumofeleme(int arr[])
    {
        return sumofeleme(arr,0);
    }
}

