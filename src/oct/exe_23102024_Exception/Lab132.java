package oct.exe_23102024_Exception;

public class Lab132 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try
        {
           int x = 10/a;
        }
        catch (Exception e)
        {
            System.out.println("div by zero");
        }
        finally
        {
            System.out.println("executed");
        }

    }
}
