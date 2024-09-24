package sept.exe_25092024;

import java.util.Scanner;

public class Lab70_User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int no = sc.nextInt();
        System.out.println(no);

        String name = sc.next();
        System.out.println(name);
    }
}
