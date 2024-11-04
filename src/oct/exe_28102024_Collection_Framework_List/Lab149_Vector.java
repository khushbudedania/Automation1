package oct.exe_28102024_Collection_Framework_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab149_Vector {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);

        mylist.add("khushbu");
        mylist.add("pooja");
        mylist.add("sachin");
        mylist.add("chirag");
        mylist.add("myra");
        mylist.add("piyush");
        mylist.add("pushpa");
        System.out.println(mylist);

        Vector v1 =new Vector();
        v1.add("kiran");//t1 -thread1
        v1.add("kajal");//t2 -thread2

    }
}
//it is legacy class similar to arraylist. you don't worray about the size automatically increase.
//it is thread safe.
//slower; time consuming.
//Vector allows duplicates, and it is implemented as a resizable array.
// Vector is a legacy class and elements will be stored internally using indexing notation.
// Vector methods are synchronized,so vector objects can’t be accessed by multiple threads at a time.(Slow)
