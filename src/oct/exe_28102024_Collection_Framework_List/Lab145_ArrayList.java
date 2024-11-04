package oct.exe_28102024_Collection_Framework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab145_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();//Dynamic Dispatch
        list.add(1);//integer
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
       // System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));//string
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(4));

        for(int i =0; i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //foreach loop
        for (Object o:list)
        {
            System.out.println(o);
        }
        }

    }

//you can also add duplicate record this is the disadvantage of the Arraylist.
//so that's why you cannot use the arraylist as the shopping list.to overcome this introduce
//a set.