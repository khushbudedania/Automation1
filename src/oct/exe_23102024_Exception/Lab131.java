package oct.exe_23102024_Exception;

public class Lab131 {
    public static void main(String[] args) {
        try {
            String s1 = "khushbu";
            String a1 = args[0];
            int a = 10/0;
            s1 = null;
        } catch (Exception e)
        {
           System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("executed");
        }
    }
}
