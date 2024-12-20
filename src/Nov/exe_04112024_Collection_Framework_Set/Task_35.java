package Nov.exe_04112024_Collection_Framework_Set;

import java.util.ArrayList;
import java.util.List;

public class Task_35 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
       // System.out.println(list.reversed());

        int index = 0;
        for (int i = list.size() - 1; i > 0; i--) {
            list.add(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            index++;
        }

            System.out.println(list);

        }
    }
//How do you reverse an ArrayList in Java?


