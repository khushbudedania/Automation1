package oct.exe_04102024;

public class Task24_Person {
    String name;
    int age;
    String eyes;
    String gender;
    String email;
    String height;
    String color;
    long phoneno;
    String address;
    String job;

    //DC -- Default constructor
    Task24_Person() {
        System.out.println("Iam a DC");
    }

    //PC -- Parameterized Constructor
    Task24_Person(String name) {
        this.name = name;

    }

    // Behavior / > Methods (function within the class)
    void walk() {
        System.out.println("walking is good for health");
        System.out.println("No Return also no argument");
    }

    void address() {
        System.out.println("Return type with no argument");
        //  return 10;
    }

    void sleep(String phoneno) {
        this.phoneno = 123456789;
        System.out.println("Return type with arguments");
        //   return "Please silent the phone while sleeping";

    }

    void read(String name) {
        this.eyes = eyes;
        System.out.println("No return type but with arguments");
        System.out.println("i can read with my eyes");
    }

    public static void main(String[] args) {

        Task24_Person jay = new Task24_Person();
        Task24_Person kay = new Task24_Person("kay");
        Task24_Person lee = new Task24_Person("lee");


        System.out.println(jay.name);
        System.out.println(kay.name);
        System.out.println(lee.name);

    }
}

