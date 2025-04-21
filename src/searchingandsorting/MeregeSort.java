package searchingandsorting;

import java.util.Scanner;

public class MeregeSort {
    public static void main(String[] args) {
        int []arr=takeinput();
        int []arr2=takeinput();
        int c[]=merge(arr,arr2);
        printarr(c);
    }
    public static int[] merge(int arr[],int arr2[])
    {   int c[]= new int[arr.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr2.length)
        {
            if(arr[i]<arr2[j])
            {
                c[k]=arr[i];
                k+=1;
                i+=1;

            }
            else
            {
                c[k]=arr2[j];
                k+=1;
                j+=1;

            }
        }
        while(i<arr.length)
        {
            c[k]=arr[i];
            k+=1;
            i+=1;
        }
        while(j<arr2.length)
        {
            c[k]=arr2[j];
            k+=1;
            j+=1;
        }
        return c;
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
}

