package searchingandsorting;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[]=takeinput();
        selectionsort(arr);
        printarr(arr);
    }
    public static int[] takeinput() {
        System.out.println("Enter the Size of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elemnts in the Array");
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        return ar;
    }

    public static void printarr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void  selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;
        i++)
        {
            int min=arr[i];
            int minindec=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minindec=j;

                }
            }
    arr[minindec]=arr[i];
            arr[i]=min;
        }
    }
}
