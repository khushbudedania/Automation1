package oct.exe_21102024_WrapperClass_Exeception;

public class Lab116 {
    public static void main(String[] args) {
        String a = "10";
        // int a1 = a;//you never convert non-primitive to primitive type directly. but if you use wrapper class then it possible.
        Integer a1 = Integer.parseInt(a);
        System.out.println(a1);
        int a2 = a1;//unboxing
        System.out.println(a2);
    }
}