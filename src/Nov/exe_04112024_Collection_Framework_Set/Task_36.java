package Nov.exe_04112024_Collection_Framework_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task_36 {
    public static void main(String[] args) {

        Integer[] num={2,2,3,4,5,5,5,3,2,4};// // add item to an Array
        HashMap<Integer,Integer> freq=new HashMap<>();// HashMap to store the elements
        // Iterate through an array to check the frequency of each item
        for(int o:num){
            freq.put(o, freq.getOrDefault(o,0)+1);
        }

        // Iterate through the elements present in the map
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            System.out.println("element :" + entry.getKey() + " Frequency :"+entry.getValue());
        }

    }
}
//Find the Frequency of Each Element in an Array ( Hashmap)
//Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4}; O/p 2→ 3 , 3 → 2 , 4→ 2, 5→ 3