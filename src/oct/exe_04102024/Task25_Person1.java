package oct.exe_04102024;

import java.util.Date;

public class Task25_Person1 {

    String First_Name;
    String Last_Name;
    Date Date_of_birth;
    long phone_no;
    String email_id;
    String city;
    long Adhar_card_no;
    float height;
    String Eye_color;
    float weight;

    //default constructor
    Task25_Person1()
    {
       System.out.println("this is a default constructor");
    }
    //PC -- Parameterized Constructor
    Task25_Person1(String First_Name, String Last_Name)
    {
        System.out.println("this is a pc");
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;

    }
    ////PC -- Parameterized Constructor
    Task25_Person1(String First_Name, String Last_Name, String Eye_color, int weight, long Adhar_card_no)
    {
        System.out.println("this is a pc");
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Eye_color = Eye_color;
        this.weight = weight;
        this.Adhar_card_no = Adhar_card_no;
    }

    // Behavior / > Methods (function within the class)
       String details(String Eye_color)// with return type with parameter
        {
        this.Eye_color = Eye_color;
        return Eye_color;
        }
        void hw(float weight, float height)//without return type with parameter
         {
           this.weight = weight;
           this.height = height;
         }

         void walk( String Last_Name)
        {
        System.out.println("this is pc");

         }

    public static void main(String[] args) {

        new Task25_Person1();

        Task25_Person1 p1 = new Task25_Person1("khushbu","dedania");
        System.out.println(p1.First_Name);
        System.out.println(p1.Last_Name);
        System.out.println(p1.details("brown"));


        Task25_Person1 p2 = new Task25_Person1("Neha","patel","brown",52,45217);
        System.out.println(p2.First_Name);
        System.out.println(p2.Last_Name);
        System.out.println(p2.Eye_color);
        System.out.println(p2.Adhar_card_no);


        Task25_Person1 p3 = new Task25_Person1();
        //System.out.println(p3.hw(52f,5.1f));
        p3.hw(5.5f,5f);
        Task25_Person1 p4 = new Task25_Person1();
        Task25_Person1 p5 = new Task25_Person1();
    }
}
//Create a Person Class with 10 Attributes and 5 Behaviorr( All types of Methods) and use the DC and PC to set the values, Create 5 Objects.