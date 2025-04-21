package TwoDimensionalArray;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class BasicInputoutput {
    public static void main(String[] args) {
    int arr[][]=inputfor2d();
    print2d(arr);
    }
    public static int[][] inputfor2d()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r= scanner.nextInt();
        System.out.println("Enter the number of columns");
    int c= scanner.nextInt();
    int arr[][]= new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            arr[i][j]= scanner.nextInt();
        }
    }
    return arr;
    }
    public static void print2d(int arr[][])
    {   int r= arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
