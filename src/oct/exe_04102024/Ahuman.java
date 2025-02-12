package oct.exe_04102024;

import javax.imageio.stream.ImageInputStream;

public class Ahuman {

    String Name;
    long adhar_card_no;
    String eyes_color;

    Ahuman()// Default constructor
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
    }

    public static void main(String[] args) {
        Ahuman amit = new Ahuman();
        System.out.println(amit.Name);// because we dont set any value for amit so that they can take null.because string default value is null.

        Ahuman khushbu = new Ahuman("khushbu");
        System.out.println(khushbu.Name);

        Ahuman chirag = new Ahuman("chirag");
        System.out.println(chirag.Name);

        Ahuman myra = new Ahuman("myra");
        System.out.println(myra.Name);



    }
}