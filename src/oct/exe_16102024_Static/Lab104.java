package oct.exe_16102024_Static;

public class Lab104 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = new A();
        new A();
    }
}


class A {
    {

        System.out.println("IIB");
    }
    static
    {
        System.out.println("SIB");
    }
}