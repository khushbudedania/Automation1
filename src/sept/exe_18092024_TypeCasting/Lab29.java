package sept.exe_18092024_TypeCasting;

public class Lab29 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);//10,11
        System.out.println(a);//11

        int b = 10;
        System.out.println(b++ + ++b);//10,12
        System.out.println(b);//12

        int c = 10;
        System.out.println(++c + c++ + c++);//11,11,12
        System.out.println(c);//13
    }
}
//10,12
//11,11,12