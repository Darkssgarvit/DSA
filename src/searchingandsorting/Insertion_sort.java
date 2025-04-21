package searchingandsorting;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
int arr[]=takeinput();
insertionsort(arr);
printarr(arr) ;
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
    public static void insertionsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
        int j=i-1;
        int temp=arr[i];
        while(j>=0 && temp<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
            arr[j+1]=temp;
        }
    }
}
