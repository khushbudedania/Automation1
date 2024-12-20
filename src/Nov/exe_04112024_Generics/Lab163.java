package Nov.exe_04112024_Generics;

public class Lab163 {
    public static void main(String[] args) {
        prints(1,"khushbu","canada");

    }
    public static <T1,T2,T3> void prints(T1 a,T2 b,T3 c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
