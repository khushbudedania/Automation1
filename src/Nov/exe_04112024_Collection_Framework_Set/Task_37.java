package Nov.exe_04112024_Collection_Framework_Set;

import java.util.HashSet;

public class Task_37 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int number : numbers) {
            if (!nums.add(number)) {
                duplicate.add(number);
            }
        }

        System.out.println("Duplicate elements: " + duplicate);
    }
}

//Duplicate Elements of an Array
//int[] numbers = {1, 2, 3, 4, 5, 1, 2}; o/p → 1,2