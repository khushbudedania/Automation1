package Nov.Practise_Program;

import java.util.HashSet;

public class P4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i : numbers)
        {
            if (!nums.add(i))
            {
                duplicate.add(i);
            }
        }
        System.out.println("Duplicate elements: " + duplicate);
    }
}
//Duplicate Elements of an Array
//int[] numbers = {1, 2, 3, 4, 5, 1, 2}; o/p → 1,2