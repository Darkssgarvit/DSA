package Linked_List;
import java.util.Scanner;
public class UserInput {
    //the Previous One were Ststic now we're approaching to the user input the time complexity for this one os O(n^2).
    // wE WILL TAKE THE INPUT FROM THE USER AUNTIL HE WRITE -1;
    public static void main(String[]args){
        Node<Integer>user=Tskeinput();
        print(user);
    }
    public static Node<Integer> Tskeinput(){
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer>head=null;
        while(data!=-1){
            Node<Integer>currentNode=new Node<Integer>(data);

            if(head==null){
            head=currentNode;
            }
            else {
                Node<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data=s.nextInt();
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

}
