package oct.exe_09102024_Inheritance.Single_Inheritance.real;

public class Lab84 {
    public static void main(String[] args) {
        Basetest b1 = new Basetest();
        Testcase1 t1 = new Testcase1();
        Testcase2 t2 = new Testcase2();

        b1.startbrowser();
        b1.closebrowser();
        t1.startbrowser();
        t1.closebrowser();
        t2.startbrowser();
        t2.closebrowser();
    }
}
