package Linked_List;

import java.util.Scanner;

public class Insertthendeaatthegivenpositiion {
    public static void main(String[]args){
    Node<Integer>ans=userinput();
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        System.out.println("Enter the Position");
        int pos= s.nextInt();
        Node<Integer>anss=insert(data,pos,ans);
        print(anss);
    }
    public static Node<Integer> userinput(){
        //This is the optimised function
        Node<Integer>head=null,tail=null;
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer>current= new Node<>(data);
            if(head==null){
                head=current;
                tail=current;
            }
            else{
                tail.next=current;//this will always keep a track of the tail
                tail=current;//THis IS the Most Important Step
            }
            data= s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer>head){
        Node<Integer>temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node<Integer> insert(int data, int pos,Node<Integer>head){
        if(pos==0){
            Node<Integer>c=new Node<>(data);
            c.next=head.next;
            c=head;
            return head;

                    }
        Node<Integer>temp=head;

        Node<Integer>c=new Node<>(data);
        int posiotn=0;
        while(temp!=null && posiotn<pos){
            temp=temp.next;
        }
        c.next=temp.next;
        temp.next=c;
        return head;
    }
}
