package oct.exe_21102024_WrapperClass_Exeception;

public class Lab126 {
    public static void main(String[] args) {
        extracted2();
        System.out.println("main execute");
    }

    private static void extracted2() {
        extracted1();
        System.out.println("extracted2 execute");

    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted1 execute");
    }

    private static void extracted() {
        try
        {
           String name = null;
           name.length();

           Integer[] i = new Integer[2];
           System.out.println(i[3]);
        }
        catch (NullPointerException e)
        {
           System.out.println("null");
           e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("null");
            e.printStackTrace();
        }

    }

}
