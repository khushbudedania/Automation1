package Nov.exe_04112024_Collection_Framework_Set;

import java.util.*;

public class Task_33 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("No","1");
        map.put("Name","POOJA");
        map.put("City","Rajkot");
        map.put("Country","India");
        System.out.println(map);

        map.put("No","2");
        map.put("Name","kinjal");
        map.put("City","baroda");
        map.put("Country","India");
        System.out.println(map);

        for (Map.Entry<String,String> item: map.entrySet())
        {
          System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}

//How do you iterate over a Map in Java?