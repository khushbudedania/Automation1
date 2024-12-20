package Nov.exe_04112024_Collection_Framework_Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab158_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        m1.put("Roll No", "1");
        m1.put("Name", "Khushbu");
        m1.put("Name", "Khushbum");//unique key (take latest one)
        m1.put(null, null);// null key and value allow
        System.out.println(m1);

        m2.put("Roll No", "1");
        m2.put("Name", "Khushbu");
        m2.put("Name", "Khushbu");//unique key (take latest one)
        m2.put(null, null);// null key and value allow
        System.out.println(m2);

         m3.put("Roll No", "1");
         m3.put("Name", "Khushbu");
         m3.put("Name", "Khushbu");//unique key (take latest one)
        //m3.put(null, null);// null key and value not allowed.
         System.out.println(m3);

    }
}
//key and value pair`
//The key is always unique in the Map.
//A Map cannot contain duplicate keys and each key can map to at most one value.
//Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the
// TreeMap.
//The order of a map depends on the specific implementations.
// For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
//There are two interfaces for implementing Map in java. They are Map and SortedMap,
// and three classes: HashMap, TreeMap, and LinkedHashMap.
//Map interface has following concrete sub classes:
//HashMap
//LinkedHashMap
//TreeMap
//Hashtable (Legacy Class)