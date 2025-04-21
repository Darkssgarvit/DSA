package searchingandsorting.Assingment;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
    int arr[]=takeinput();
    sort012(arr);
    printarr(arr);
    }
    public static void sort012(int arr[])
    {   int index=0;
        int i=0;
        int lastindex=arr.length-1;
       while(i<=lastindex)
        {
            if(arr[i]==0)
            {   int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
                i+=1;
            }
            else if (arr[i]==2)
            {   i+=1;
                int main=arr[lastindex];
                arr[lastindex]=arr[i];
                arr[i]=main;
                lastindex--;
            }
        }
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
}
