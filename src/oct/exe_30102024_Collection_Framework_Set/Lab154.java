package oct.exe_30102024_Collection_Framework_Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab154 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        LinkedHashSet lhs = new LinkedHashSet();
        TreeSet ts = new TreeSet();

        hs.add("khushbu");// function are same for all.
        hs.add("khushbu"); //Duplicate are not allowed.
        hs.add("Khushbu");
        hs.add("KHUSHBU");
        hs.add(1);
        System.out.println(hs);//random order

        lhs.add("khushbu");// function are same for all.
        lhs.add("khushbu"); //Duplicate are not allowed.
        lhs.add("Khushbu");
        lhs.add("KHUSHBU");
        lhs.add(1);
        System.out.println(lhs);// order as user enter.

        ts.add("khushbu");// function are same for all.
        ts.add("chirag"); //Duplicate are not allowed.
        ts.add("pooja");
        ts.add("myra");
        //ts.add(null);//not allowed.
        //ts.add(1);//object must be a comparable otherwise throw an exception.
        System.out.println(ts);//sorted order alphabetically
    }
}
