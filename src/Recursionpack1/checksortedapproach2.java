package Recursionpack1;

import java.util.Scanner;

public class checksortedapproach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        boolean ans=checker(arr);
        System.out.println(ans);
    }

    public static boolean checker(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        if (!(arr[0] <= arr[1])) {
            return false;
        }
        int ans[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            ans[i - 1] = arr[i];
        }
        boolean anss = checker(ans);
        return anss;
    }
}


