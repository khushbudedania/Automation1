package oct.exe_21102024_WrapperClass_Exeception;

public class Lab115 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a = 10;
        Integer b = a;//boxing  int -> Integer
        System.out.println(a);
        System.out.println(b.intValue());
        System.out.println(Integer.MAX_VALUE);//static class directly use
        System.out.println(Integer.MIN_VALUE);

        //wrapper to primitive type
        Integer a1 = 20;
        int value = a1;//unboxing  Integer -> int
        System.out.println(value);
    }
}
