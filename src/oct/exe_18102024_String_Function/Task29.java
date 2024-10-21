package oct.exe_18102024_String_Function;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        String str = "khushbu";
        String rev = "";

        int i = 0;
        for (i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
//Reverse the String without using the any functons. (for loop)