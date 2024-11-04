package oct.exe_30102024_Collection_Framework_List;

import java.util.Stack;

public class Lab152_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("pramod");
        stack.add("dutta");
        System.out.println(stack);

        Stack books =new Stack();
        books.push("java");
        books.push("c#");
        books.push(".net");
        books.push("c++");
        System.out.println(books);

        System.out.println(books.pop());
        System.out.println(books);

        System.out.println(books.peek());//only see last element which one.
        System.out.println(books);

        System.out.println(books.empty());
        books.add(1,"core");
        System.out.println(books);

    }
}
//They work in LIFO manner.