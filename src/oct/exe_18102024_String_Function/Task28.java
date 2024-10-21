package oct.exe_18102024_String_Function;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int count = 0;
          System.out.println("Enter the string = ");
          String userInput = sc.next();


        for(int i = 0; i <= userInput.length(); i++);
        {
            count++;
            System.out.println("length = " + userInput.length());
        }

    }
}
//Calculate the length of the String - without using the length() function.
// String name =”Pramod”; →  6 , CharArray, for loop