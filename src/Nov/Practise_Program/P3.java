package Nov.Practise_Program;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {
        Integer[] num = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};//add item to an Array

        HashMap<Integer, Integer> freq = new HashMap<>();// HashMap to store the elements


        for (int o : num)  // Iterate through an array to check the frequency of each item
        {
            freq.put(o, freq.getOrDefault(o, 0) + 1);
        }

        // Iterate through the elements present in the map
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println("element :" + entry.getKey() + " Frequency :" + entry.getValue());
        }
    }
}
//Find the Frequency of Each Element in an Array ( Hashmap)
