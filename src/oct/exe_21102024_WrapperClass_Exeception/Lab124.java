package oct.exe_21102024_WrapperClass_Exeception;

public class Lab124 {
    public static void main(String[] args) {
        ProbleamF probleamF = new ProbleamF();
        System.out.println(probleamF.show());
    }
}
class ProbleamF {
    int a = 10;
    int show()
    {
        try
        {
           // a = 10/0;
            System.out.println("In class -> " + a);
            return a;
        }
        catch (Exception e)
        {
           System.out.println("Catch");
           a = 20;
           return a;
        }
        finally
        {
            System.out.println("finally");
            //int[] a1 = new int[-1];//NegativeArraySizeException
        }
    }
}