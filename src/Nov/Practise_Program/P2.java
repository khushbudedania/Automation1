package Nov.Practise_Program;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //System.out.println(list);
        int index = 0;
        for (int i = list.size()-1; i>0; i--)
        {
            list.add(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            index++;
        }
        System.out.println(list);
    }
}

//How do you reverse an ArrayList in Java?
