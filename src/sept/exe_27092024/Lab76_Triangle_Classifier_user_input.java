package sept.exe_27092024;

import java.util.Scanner;

public class Lab76_Triangle_Classifier_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side1 =  ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side2 = ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side3");
        double side3 = sc.nextDouble();

        if(side1 >=1 && side2 >=1 && side3 >=1) {

            if (side1 == side2 && side2 == side3 && side3 == side1)
            {
                System.out.println("Eq");
            }
            else if (side1 == side2 || side2 == side3 || side3 == side1)
            {
                System.out.println("ISO");
            }
            else
            {
                System.out.println("scalene");
                }

          // else
            {
                System.out.println("Negative Length Not Allowed");
            }
        }
    }
}
