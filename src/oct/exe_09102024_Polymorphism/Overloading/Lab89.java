package oct.exe_09102024_Polymorphism.Overloading;

import java.awt.*;

public class Lab89 {
    public static void main(String[] args) {
        Mathoperation m = new Mathoperation();

        int result = m.add(22,22);
        System.out.println(result);


        float result1;
        result1 = m.add(2.2f,2.2f);
        System.out.println(result1);

        m.bark();
        m.bark(10);


    }
}
