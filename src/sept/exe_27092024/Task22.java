package sept.exe_27092024;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int i;
        for (i = 2; i <= 10; i++)
            do {
                System.out.println("Even No = " + i);
                i++;
            }
            while (i % 2 == 0);
    }
}
//Create a Java program that prints the first 5 even numbers using a do-while loop