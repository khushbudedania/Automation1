package oct.exe_30102024_Collection_Framework_List;

import java.util.LinkedList;
import java.util.List;

public class Lab150_LinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();//Dynamic Dispatch because linkedlist is a complete class.
        LinkedList linkedList = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        linkedList.add(5);
        System.out.println(list);
        System.out.println(linkedList);



    }
}
//LinkedList allows duplicates and internally implements a **doubly-linked list data structure.
//LinkedList elements will be stored internally using node representation.
//It is fast to insert or delete the elements, but slow for accessing the elements.