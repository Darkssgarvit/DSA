package Linked_List;

import java.util.ArrayList;

public class ArrAy_List {
public static void main(String[]args){
    //This is my first ArrayList Program
    ArrayList<Integer>arr=new ArrayList<>();
    arr.add(20);
    arr.add(99);
    System.out.println(arr);
    System.out.println(arr.size());
    System.out.println(arr.get(1));
    arr.add(1,33);
}
}
