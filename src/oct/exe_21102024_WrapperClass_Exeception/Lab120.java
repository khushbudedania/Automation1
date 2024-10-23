package oct.exe_21102024_WrapperClass_Exeception;

public class Lab120 {
    public static void main(String[] args) {
        int a = 10;
        int b = a/0; //ArithmeticException -> jvm terminated
        System.out.println(b);
    }
}
//here there is no exception at compile time.
//but run time in line no 6 jvm found unchecked Exception they dont execute line no 7 and terminate the program.