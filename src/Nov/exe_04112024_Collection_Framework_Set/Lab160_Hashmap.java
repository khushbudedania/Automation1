package Nov.exe_04112024_Collection_Framework_Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab160_Hashmap {
    public static void main(String[] args) {
        HashMap<String,String>  student1 = new HashMap();
        student1.put("no", "1");
        student1.put("name", "khushbu");
        student1.put("phone_no", "1456");
        student1.put("city", "Rajkot");
        student1.put("name", "khushbu");
        System.out.println(student1);

        HashMap<String,String>  student2 = new HashMap();
        student2.put("no", "2");
        student2.put("name", "khu");
        student2.put("phone_no", "1456");
        student2.put("city", "Rajkot");
        System.out.println(student2);

        HashMap<String,String>  student3 = new HashMap();
        student3.put("no", "3");
        student3.put("name", "khushbu");
        student3.put("phone_no", "1456");
        student3.put("city", "Rajkot");
        System.out.println(student3);

        HashMap<String,String>  student4 = new HashMap();
        student4.put("no", "4");
        student4.put("name", "khushboooo");
        student4.put("phone_no", "1456");
        student4.put("city", "Rajkot");
        System.out.println(student4);

        List ls = new ArrayList();
        ls.add(student1);
        ls.add(student2);
        ls.add(student3);
        ls.add(student4);
        System.out.println(ls);

    }
}
