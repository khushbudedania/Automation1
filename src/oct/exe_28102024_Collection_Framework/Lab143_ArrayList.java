package oct.exe_28102024_Collection_Framework;

import java.util.ArrayList;

public class Lab143_ArrayList {
    public static void main(String[] args) {
        ArrayList student = new ArrayList();
        student.add("Pramod");
        student.add("Dutta");
        student.add("Dutta");//Duplicate record also allow.
        student.add("Ankit");
        student.add("Pooja");
        student.add(true);
        student.add(123);//Different datatype also support.

        System.out.println(student);


    }
}
//Collection -> Interface
//List -> Interface(you cannot create object of the interface.)
//ArrayList, LinkedList, stack, vector alla are classes.
//List is a collection of items with same or different datatypes.
//why List Duplicate record and Different datatype support.
//because collection framework work with object and they cosider all this value("Dutta","pramod")as object.