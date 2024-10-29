package oct.exe_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab146_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(99);
        marks.add(71);
        marks.add(51);
        System.out.println(marks);
        //sorting
        Collections.sort(marks);
        System.out.println(marks);
        //Reverce order
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
