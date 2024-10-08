package oct.exe_09102024_Polymorphism.Overridding;

public class Hound extends Dog{

        @Override
        void bark()
        {
            System.out.println("hound");
            super.bark();
        }
    }

