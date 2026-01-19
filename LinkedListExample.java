import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args){
        LinkedList<String> lst = new LinkedList<String>();

        //add elements to linked list
        lst.add("One");
        lst.add("Two");
        lst.add("Three");
        lst.add("Four");
        lst.add("Five");
        //print linkedlist
        System.out.println("Linked List:    "+lst);

        //remove elements from linkedList
        lst.remove(0);
        
        //add element at specified index
        lst.add(4, "Six");

        System.out.println("Updated Linked List:    "+lst);

    }
}