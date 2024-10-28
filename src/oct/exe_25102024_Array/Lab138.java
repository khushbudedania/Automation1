package oct.exe_25102024_Array;

import java.util.Arrays;

public class Lab138 {
    public static void main(String[] args) {
        int[] marks = {51,85,84,10,30};
       /* System.out.println(marks.length);//length always start from 1.
        System.out.println(marks[0]);//index always start from 0.
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        Arrays.sort(marks);
        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/


        for(int i =0; i < marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        int item = Arrays.binarySearch(marks,30);
        System.out.println(item);
    }
}
