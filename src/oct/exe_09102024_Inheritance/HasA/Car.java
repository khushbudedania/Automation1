package oct.exe_09102024_Inheritance.HasA;

public class Car {
    void startcar()
    {
        new Engine().start();
        new Tyre().rolling();
    }
}
