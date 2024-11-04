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
        System.out.println(hs);//random order

        lhs.add("khushbu");// function are same for all.
        lhs.add("khushbu"); //Duplicate are not allowed.
        lhs.add("Khushbu");
        lhs.add("KHUSHBU");
        System.out.println(lhs);// order

        ts.add("khushbu");// function are same for all.
        ts.add("khushbu"); //Duplicate are not allowed.
        ts.add("Khushbu");
        ts.add("KHUSHBU");
        System.out.println(ts);//random order
    }
}
