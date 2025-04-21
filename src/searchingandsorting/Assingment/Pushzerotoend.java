package searchingandsorting.Assingment;

import java.util.Scanner;

public class Pushzerotoend {
    public static void main(String[] args) {
    int arr[]=takeinput();
    pushzerotoend(arr);
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
    public static void pushzerotoend(int arr[])
    {
        int first=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[first];
                arr[first]=temp;
                first+=1;
            }
        }
    }

}
