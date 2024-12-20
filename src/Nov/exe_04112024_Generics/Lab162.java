package Nov.exe_04112024_Generics;

public class Lab162 {
    public static void main(String[] args) {
     Temp(12);
     Temp(true);

    }

    public static <T> void Temp(T a)
    {
        System.out.println(a);
    }
}
//Generics allow the reusability of code, where one single method can be used for different data-types
// of variables or objects.
// idea is to allow different types like Integer, String, … etc and user-defined types to be a parameter
// to methods, classes, and interfaces.
//T is aanything(ref.)