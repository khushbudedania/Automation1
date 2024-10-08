package oct.exe_18102024_String_Function;

public class Lab_113_String_Immutable {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "World";
        String S3 = S1.concat("World");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S1);
    }
}
