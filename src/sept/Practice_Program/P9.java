package sept.Practice_Program;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {

        int result = 0;
        int c = '+';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No1");
        int num1 = sc.nextInt();
        System.out.println("Enter No2");
        int num2 = sc.nextInt();

        switch (c)
        {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(result);
                break;
        }

    }
}
//Create a simple calculator that performs
// addition, subtraction, multiplication, and division,modus based on user input using switch statements.
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information