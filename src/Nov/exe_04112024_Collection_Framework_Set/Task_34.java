package Nov.exe_04112024_Collection_Framework_Set;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Task_34 {
    public static void main(String[] args) {
        //allow null key onces and values
        //random order.
        //iterate over with for loop.
        //concreate class

        HashMap<Integer,String> hs = new HashMap();
        hs.put(1,"ONE");
        hs.put(2,"TWO");
        hs.put(null,"ONE");
        hs.put(3,null);
        System.out.println(hs);

        for(Map.Entry<Integer,String> item: hs.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
        }


        //don't allow null key and value.
        //random order.
        //method is Synchronized(thread safe).
        //Legacy class.

        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"one");
        hashtable.put(2,"two");
        //hashtable.put(null,"one");
        //hashtable.put(3,null);
        //hashtable.put(null,null);
        System.out.println(hashtable);

       /* for(Map.Entry<Integer,String> item: hashtable.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
        }*/

        Enumeration<Integer> e = hashtable.keys();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
           // System.out.println(hashtable.get(e.nextElement()));
        }

    }
}
//What is a Hashtable in Java, and how does it differ from HashMap?