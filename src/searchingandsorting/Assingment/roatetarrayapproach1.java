package searchingandsorting.Assingment;

import java.util.Scanner;

public class roatetarrayapproach1 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int arr[]=input();
        System.out.println("The number of rotations");
        int d=m.nextInt();
        rotate(arr,d);
        printcomplete(arr);
    }
    public static int[] input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }

        return array;
    }
    public static void printcomplete(int array[])
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void rotate(int array[],int d){
        int m=0;
        while(m<d)
        {   int temp=array[0];
            for(int i=0;i< array.length-1;i++)
            {
                array[i]=array[i+1];
            }
            array[array.length-1]=temp;
            m+=1;
        }
    }
}
