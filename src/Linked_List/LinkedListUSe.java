package Linked_List;

public class LinkedListUSe {
    public static void main(String[]args){
        Node<Integer> n1; //This Will Be the Refrence Not the node
        n1=new Node<Integer>(10);//this Will Create the new Node
        System.out.println(n1);//This Will Return The Node Address
        System.out.println(n1.data);//will Give the Value At the Particular Node
        System.out.println(n1.next);//will give the value for the next
//        System.out.println(createLinkedList());
        Node<Integer>head=createLinkedList();
//        System.out.println(head);
        PrintallNode(head);
    }
    public static Node<Integer> createLinkedList(){
        Node<Integer>n1= new Node<Integer>(10);
        Node<Integer>n2= new Node<Integer>(20);
        Node<Integer>n3= new Node<Integer>(30);
        Node<Integer>n4= new Node<Integer>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
//        System.out.println(n1.data+" "+n2.data+" "+n3.data+" "+n4.data);

        return n1;
    }
    public static void PrintallNode(Node<Integer>head){
        Node<Integer>temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
