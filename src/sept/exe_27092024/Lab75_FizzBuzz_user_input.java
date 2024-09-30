package sept.exe_27092024;

import java.util.Scanner;

public class Lab75_FizzBuzz_user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. =");
        int n = sc.nextInt();

        for(int i = 1; i<=100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
