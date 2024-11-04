package oct.exe_28102024_Collection_Framework_List;

import java.util.List;

public class Lab144_List {
    public static void main(String[] args) {
        List list = List.of("Apple","Banana","Grapes","Pear");
        System.out.println(list);
       // System.out.println(list.add("Chickoo"));
        System.out.println(list.isEmpty());


    }

}
//of is static method in Interface that can contain the defination.
//add fun.is not supported because (of) is static in nature.
//list has no func. available for add.(it is possible with the dynamic dispatch).