package oct.exe_14102024_Abstraction.Interface;

public class Lab101 {


    interface I3{
        default void start()// only default and static have body in interface.
        {
            System.out.println("hi");
        }
        void stop();
        void ss();
        static void AA()
        {
            System.out.println("hello");
        }
        abstract class AA{
            void f1()
            {
                System.out.println("complete method(concrete method)");
            }
            abstract void f2();//incomplete method in abstract class.
        }
    }
}
//you can use abstact or interface to hide the functionality.
//abstact with both method complete and incomplete(using abstact keyword).
//in interface only possible incomplete method.
//only default and static method have body in interface.