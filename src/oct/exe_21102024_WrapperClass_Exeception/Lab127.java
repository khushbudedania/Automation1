package oct.exe_21102024_WrapperClass_Exeception;

public class Lab127 {
    public static void main(String[] args) {//1
      Hello hello = new Hello();//2
      hello.process();//4
      System.out.println("KHUSHBU");
    }
}


class Hello{//3
    int process()
    {
        throw new NullPointerException();//5
    }
}
//no is for how whole program is line by line executed.