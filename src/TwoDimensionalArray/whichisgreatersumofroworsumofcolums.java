package TwoDimensionalArray;

import java.util.Scanner;

public class whichisgreatersumofroworsumofcolums {
    public static void main(String[] args) {
        int arr[][]=inputfor2d();
        roworcolumnsum(arr);

    }
    public static void roworcolumnsum(int arr[][])
    {
        int largestsum=0;
        int rowsum=0;
        int columnsum=0;
        boolean rowsumisgreater=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                rowsum+=arr[i][j];
            }
        }
        largestsum=rowsum;
        for(int j=0;j<arr[0].length;j++)
        {
            for(int i=0;i<arr.length;i++)
            {
                columnsum+=arr[i][j];
            }
        }
        if(columnsum>largestsum)
        {
            largestsum=columnsum;
            rowsumisgreater=false;
        }
        if(rowsumisgreater)
        {
            System.out.println("Row Sum is Greater"+ rowsum);
        }
        else
        {
            System.out.println("Column sum is Greater"+ columnsum);
        }


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
}
