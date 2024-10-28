package oct.exe_21102024_WrapperClass_Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab123 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("file.txt");
        } catch (FileNotFoundException e)
        {
           System.out.println("file not found");
        }
        finally {
           // if(file != null);//finally will not execute.
           // {
              //  try
               // {
//                    file.close();
//                } catch (IOException e)
//                {
//                   System.out.println("hi");
//                }
            System.out.println("hi");
            }

        }

    }


