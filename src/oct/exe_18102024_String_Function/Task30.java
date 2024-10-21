package oct.exe_18102024_String_Function;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

             String str="madam";
             String str1="";
             char ch;
             for(int i=0;i<str.length();i++)
             {
               ch = str.charAt(i);
               str1 = ch + str1;
             }
                System.out.println(str);
                System.out.println(str1);
             if(str.equals(str1))
             {
                 System.out.println("String is palindrome");
             }
             else
             {
                System.out.println("String is not a palindrome");
             }
                }
                }


//Palindrome

//Input : str = "abba"
//Output: Yes

//Input : str = "pramod"
//Output: No
