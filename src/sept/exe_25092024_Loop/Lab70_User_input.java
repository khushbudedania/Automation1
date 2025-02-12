package sept.exe_25092024_Loop;

import java.util.Scanner;

public class Lab70_User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int no = sc.nextInt();
        System.out.println(no);

        System.out.println("Enter Name.");
        String name = sc.next();
        String n = sc.nextLine();
        System.out.println(name);
        System.out.println(n);
    }
}
