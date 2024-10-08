package oct.exe_09102024_Polymorphism.Overridding;

public class Lab91 {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.home();

        Father f1 = new Father();
        f1.home();

        Father object = new Daughter();// Dynamic Dispatch
        object.home();

    }
}
// in dynmaic dispatch daughter object is created that's why daughter home is access.
//not possible to create father object because in real life when daughter is born then father can see.not vice versa.