package oct.exe_04102024;

import javax.imageio.stream.ImageInputStream;

public class Ahuman {

    String Name;
    long adhar_card_no;
    String eyes_color;

     Ahuman ()// Default constructor
     {
        System.out.println("this is no return type");
        // write a code here which will automatically executed when the method is created.
     }

     Ahuman(String Name)//parametrized constructor
     {
         System.out.println("this is param constructor");
         this.Name = Name;
     }
    void walk() {
        System.out.println("this is no return type no argument function");
    }

    int talk() {
        System.out.println("this is with return type without argument function");
        return 10;
    }

    void eat(String Name) {
        System.out.println("this is without return type with argument function");
    }

    String sleep(String Name) {
        System.out.println("this is with return type and with argument function");
        return "I am slepping";

       /* public static void main(String[] args)
        {
            Ahuman amit = new Ahuman();

        }*/
    }
}