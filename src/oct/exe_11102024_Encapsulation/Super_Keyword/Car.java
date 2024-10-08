package oct.exe_11102024_Encapsulation.Super_Keyword;

public class Car extends Vehicle{


   private int maxspeed = 180;
   private String Name;

        Car() {
            super(10);

            System.out.println("this is car dc");
            System.out.println(this.maxspeed);
            System.out.println(super.Max_speed);

        }

        Car(String Name) {

            System.out.println("this is car pc");
        }

        void maxspeed()
        {

            System.out.println(400);
        }
}

