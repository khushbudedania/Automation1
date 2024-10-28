package oct.exe_23102024_Exception;

public class Lab128 {
    public static void main(String[] args) {
        int a = 10;
        try {
            int c = a/0;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new ArithmeticException();//Always write throw in last line.
        }
        finally
        {
            System.out.println("Always executed");
        }

    }
}
