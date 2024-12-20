package Nov.exe_04112024_Collection_Framework_Set;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab161_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hs1 = new Hashtable<>();
        hs1.put("one",1);
        hs1.put("Two",2);
        System.out.println(hs1);

        Enumeration<String> e = hs1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
           // System.out.println(hs1.get(e.nextElement()));
        }

    }
}
//Hashtable class in Java is a part of the Java Collections Framework and implements a hash table data structure.
//It is similar to `HashMap` , but there are key differences, particularly regarding synchronization and handling
// of null values.
//Key Features of Hashtable
//Synchronized All methods in `Hashtable`  are synchronized, making it thread-safe.
//1)This means multiple threads can access a `Hashtable`  without corrupting its state.
//2)Hashtable does not allow null keys or values.
//3)Attempting to insert a null key or value will result in a `NullPointerException`.
//4)Hashtable is considered a legacy class. New applications are encouraged to use `HashMap`
//5)unless synchronization is required.
