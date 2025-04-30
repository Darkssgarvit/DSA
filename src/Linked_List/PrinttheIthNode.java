package Linked_List;

public class PrinttheIthNode {
    public static void main(String[]args){
        Node<Integer>head=input();
//        Print(head);
        printtheithnode(head,2);
    }
    public static void Print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node<Integer> input() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    public static void printtheithnode(Node<Integer>head, int i) {
        int position = 0;
        Node<Integer> temp = head;
        while (temp != null && position < i) {
            temp = temp.next;
            position++;
        }
//        if (temp != null) {
            System.out.println(temp.data);
//        }
    }
}
