package Nov.exe_04112024_Collection_Framework_Set;

import java.util.HashMap;
import java.util.Map;

public class Lab159_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<String,Integer>();
        //Map<String,Integer> m1 = new HashMap<>();
        //Map<String,Integer> m1 = new HashMap();
        m1.put("id1",1);
        m1.put("id2",12);
        m1.put("id3",61);
        m1.put("id4",91);
        m1.put("id5",null);
        m1.put("id6",null);
        m1.put(null,91);
        m1.put(null,99);//only one time null allow key (take latest)
        System.out.println(m1);
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id1"));
        System.out.println(m1.size());
        System.out.println(m1.containsValue(99));
        System.out.println(m1.keySet());
        System.out.println(m1.values());

        for(Map.Entry<String,Integer> item:m1.entrySet())
        {
            System.out.println(item.getKey()+" -> "+ item.getValue());
        }
        }
}
//HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface
// of Java. It stores the data in (Key, Value) pairs.
//No Duplicate Key on HashMap
//LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted
// into it.
//The TreeMap in Java is used to implement the Map interface and NavigableMap
// along with the Abstract Class. The map is sorted according to the natural ordering of its keys,
//or by a Comparator provided at map creation time, depending on which constructor is used