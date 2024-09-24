package sept.exe_23092024;

public class Task13_Calculator_using_switch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int c = '%';
        int result = 0;

        switch (c) {
            case '+':

                System.out.printf("Addition of  %d + %d = %d",num1,num2,num1 + num2 );
                break;

            case '-':

                System.out.printf("Substration of  %d - %d = %d",num1,num2,num1 - num2 );
                break;

            case '*':

                System.out.printf("Multiplication  of  %d * %d = %d",num1,num2,num1 * num2 );
                break;

            case '/':

                System.out.printf("Division of  %d / %d = %d",num1,num2,num1 / num2 );
                break;

            case '%':
                System.out.printf("Modulus of  %d '%' %d = %d",num1,num2,num1 % num2 );
                break;

            default:

                System.out.println("not any option");
                break;
        }

    }
}
//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus
// based on user input using switch statements.
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.