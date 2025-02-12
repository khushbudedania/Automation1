package oct.Practise_Program;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();

        int length = 0;
        char a[] = name.toCharArray();
        for (int i = 0; i < a.length; i++)
        {
            length++;
        }
        System.out.println(length);
    }
}
//Calculate the length of the String - without using the length() function.
// String name =”Pramod”; →  6 , CharArray, for loop