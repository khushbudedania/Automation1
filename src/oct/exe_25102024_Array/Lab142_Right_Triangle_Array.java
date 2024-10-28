package oct.exe_25102024_Array;

import java.util.Scanner;

public class Lab142_Right_Triangle_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of star = ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

//*
//**
//***
//****
//*****