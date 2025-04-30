package Linked_List;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    //Program to remove duplicate from the arraylist
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int j=n.nextInt();
        int arr[]=new int[j];
        for(int i=0;i<j;i++){
            arr[i]=n.nextInt();
        }
        ArrayList<Integer>asn=removeduplicate(arr);
        print(asn);

    }
    public static ArrayList<Integer> removeduplicate(int arr[]){
        ArrayList<Integer>redult=new ArrayList<>();
        redult.add(arr[0]);
        for(int  i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                redult.add(arr[i]);
            }
        }
        return redult;
    }
    public static ArrayList<Integer> input(){
        ArrayList<Integer>arr=new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Elements you want to insert");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            arr.add(s.nextInt());
        }
        return arr;
    }
    public static void print(ArrayList<Integer>arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
