package oct.exe_23102024_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab133 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
        finally
        {
            System.out.println("always executed");
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("a.com");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("executed");
        }


    }
}
