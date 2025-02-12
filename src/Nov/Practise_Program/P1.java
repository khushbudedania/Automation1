package Nov.Practise_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        Map<String, String> s1= new HashMap();
        s1.put("No", "1");
        s1.put("Name","Khushbu");
        s1.put("City","Montreal");
        s1.put("Country","Canada");

        Map s2= new HashMap();
        s2.put("No", "2");
        s2.put("Name","Khushbu");
        s2.put("City","Montreal");
        s2.put("Country","Canada");

        Map s3= new HashMap();
        s3.put("No", "3");
        s3.put("Name","Khushbu");
        s3.put("City","Montreal");
        s3.put("Country","Canada");

        Map s4= new HashMap();
        s4.put("No", "4");
        s4.put("Name","Khushbu");
        s4.put("City","Montreal");
        s4.put("Country","Canada");

        List list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list);

        for (Map.Entry item : s1.entrySet()) {
            System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}
//How do you iterate over a Map in Java?