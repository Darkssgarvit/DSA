package Linked_List;
import java.util.Scanner;
public class OptimizeInput {
    public static void main(String[]args){
        //This one is the Optimized Input Program Here We Will Eliminate The SECOND TAIL WHILE LOOP
    Node<Integer>user=userinput();
    print(user);
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
}