package oct.exe_23102024_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab135 {
    public static void main(String[] args) throws Exception
    {
        extracted();

    }
    public static void extracted() throws FileNotFoundException
    {

        FileInputStream fileInputStream = new FileInputStream("adasd.txt");

    }
}
//throws
//it is used to annoushment.
//it is used with main method.
//and only one time written(multiple throws not allowed).
//but you can write public void int() throws Ioexception,sql exception.

//throw
// it is used to throw the explicit execption.
//it is used to within the method.
//you can't throw multiple execption.
//it is used to custom exception