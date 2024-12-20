package Nov.exe_04112024_Collection_Framework_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task_33A {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"ONE");
        hs.put(2,"TWO");
        hs.put(3,"THREE");
        hs.put(4,"FOUR");
        hs.put(5,"FIVE");
        hs.put(6,"SIX");
        hs.put(7,"SEVEN");
        hs.put(8,"EIGHT");
        hs.put(9,"NINE");
        hs.put(null,"ONE");
        hs.put(10,null);
        System.out.println(hs);

        for(Map.Entry<Integer,String> item: hs.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
        }

    }
}
//How do you iterate over a Map in Java?