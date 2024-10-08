package oct.exe_18102024_String_Function;

public class Lab109 {
    public static void main(String[] args) {
        String s1 = "KHUSHBU";//String constant pool area(scp)
        s1 = "POOJA";
        s1 = "piu";
        System.out.println(s1);

        String string = new String("CHIRAG");//object area
        String string1 = new String("KHUSHBU");
        System.out.println(string);
        System.out.println(string1);
    }
}
// String can be created twoway in java.
//(=) with the use of assighnment operator.(when you create they store their value in String constant pool area)
//(new) new operator. (they store their value in heap area or object area)
// When you create a string literal, the Java Virtual Machine (JVM) checks the "string constant pool"
// to see if an identical string already exists. If it does, it returns a reference to that instance;
// otherwise, it creates a new one.
//new everytime create new location.