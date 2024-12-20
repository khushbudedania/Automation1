package oct.exe_30102024_Collection_Framework_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab155_Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();//they use hashing mechanisam to store the value.
        hs.add("Apple");//Duplicate value not allowed.
        hs.add("Orange");//no order maintain.
        hs.add("Banana");
        hs.add(null);//null value allow.
        hs.add("Apple");
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Banana");
        lhs.add(null);////null value allow.
        lhs.add("Apple");
        lhs.add("Chickoo");
        System.out.println(lhs);//order maintain.

        TreeSet ts = new TreeSet();
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
       // ts.add(null);////null value not allow.
        ts.add("Apple");
        System.out.println(ts);//order maintain alphabetically.

        for(Object o: ts)
        {
            System.out.println(o);
        }

        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }



}
