package oct.exe_21102024_WrapperClass_Exeception;

public class Lab121 {
    public static void main(String[] args) {
        //unchecked
        //jVm is found at run time.Terminated the program.
         String s1 = null;
         System.out.println(s1.trim());//NullPointerException
    }
}
