package oct.exe_28102024_Collection_Framework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab148_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("khushbu");
        mylist.add("pooja");

        System.out.println("to print arraylist 1st way");
        for(Object o: mylist);
        System.out.println(mylist);

        System.out.println("to print arraylist 2nd way");
        for(int i = 0; i < mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

        System.out.println("to print arraylist 3rd way(Iterator)");

        Iterator iterator = mylist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
