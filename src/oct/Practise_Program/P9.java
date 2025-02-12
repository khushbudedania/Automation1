package oct.Practise_Program;

import java.util.Arrays;
import java.util.Comparator;

public class P9 {
    public static void main(String[] args) {
        int[] array = new int[]{6,5,8,2,0};
        System.out.println(array.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));



//        Arrays.sort(array,Comparator.reverseOrder());
//        System.out.println(Arrays.toString(array));


    }
}
