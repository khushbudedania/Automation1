package Nov.exe_04112024_Collection_Framework_Set;

import java.util.HashSet;

public class Lab156_Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Apple");//duplicate not allowed.
        System.out.println("Set Elements: " + hs );

    }
}
//**** hashing Mechanism****
//it contain hash table. in hash table it has key value pair
//key -> unique key created by the hashcode function.
//value -> that you want to store.
//like if i want to store value 11 then fun.(11%10 = 1 remainder)
// then the 11 is get the key 1.
//but if you again store 11 then they dont allow because duplicate is not allowed.