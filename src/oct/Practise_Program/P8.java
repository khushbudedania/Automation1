package oct.Practise_Program;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int No = sc.nextInt();

        System.out.printf("Table Of -> "  +  No);
        System.out.println();
        for (int i = 1; i<= 10; i++)
        {
            System.out.printf("%d * " +i+ " =  %d "  + i,No,i*No);
            System.out.println();
        }

    }
}
