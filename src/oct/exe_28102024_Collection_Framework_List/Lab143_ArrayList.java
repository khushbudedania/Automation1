package oct.exe_28102024_Collection_Framework_List;

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
//ArrayList, LinkedList, stack, vector all are classes.
//List is a collection of items with same or different datatypes.
//why List Duplicate record and Different datatype support?
//because collection framework work with object and they cosider all this value("Dutta","pramod")as object.
//ArrayList - Behind the scene it is **growable array(dynamic array).**
//Array -> 10 -> you enter the 9th item
// -> 20th array automatically (it is done in ArrayList Class) -
// You don't have worry about it How it is done, we have to just use it as it is.
// ArrayList allows duplicates and it is implemented as a resizable array.
// ArrayList elements will be stored internally using indexing notation.
// This is one of the most widely used concrete class.
// It is fast to access the elements, but slow to insert and delete the elements.
