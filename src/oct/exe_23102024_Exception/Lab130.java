package oct.exe_23102024_Exception;

public class Lab130 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException  | NumberFormatException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
       /* catch (Throwable e)//here you can also use throwable as well as Exception(parent)
        {
            System.out.println(e.getMessage());
        }*/
        finally
        {
            System.out.println("Always Executed");
        }

    }
    }

