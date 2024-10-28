package oct.exe_21102024_WrapperClass_Exeception;

public class Lab122_try_catch {
    public static void main(String[] args) {
        int a = 10;
        try
        {
           int b = 10/a;
           System.out.println(b);
           String s1 = null;
           System.out.println(s1.trim());
        }
        catch (ArithmeticException | NullPointerException   | ArrayIndexOutOfBoundsException e)
        {

            System.out.println("Exception");
        }
        System.out.println("end");

    }
}

