package oct.exe_25102024_Array;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Task_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = n; j > i+1; j--)
            {
                System.out.print(" ");
            }

                for (int k = 0; k < (i * 2) + 1; k++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

//Pyramid pattern in Java

//    *
//   ***
//  *****
// *******
//*********