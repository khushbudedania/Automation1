package oct.exe_21102024_WrapperClass_Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab119 {
    public static void main(String[] args)  {
        //checked--jvm knows
       // FileInputStream file = new FileInputStream("c:aaa");
        //Jvm knows that file may not exit

        //unchecked (Arithmetic Exception)
        int a = 10;
        int b = a/0;
        System.out.println(b);

    }
}
