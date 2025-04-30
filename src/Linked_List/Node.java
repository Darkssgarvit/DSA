package Linked_List;

//public class Node {
//    int data; //the type of data
//    Node next; //next is the variable name,The Type of Node Will Be same so we have wrote this Node here
//    Node(int data){
//        this.data=data;
////        next=null; This Statment isn't required cuz default will be the null
//        // Thus One is Only Capable of Store the Integer Type Data
//    }
//}


//Let;s GO on For the Generic one

public class Node<T>
{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }
    //Hence While Specifying the Node We hAve to gie the datatype as well explicitily
}
