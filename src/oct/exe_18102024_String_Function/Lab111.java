package oct.exe_18102024_String_Function;

public class Lab111 {
    public static void main(String[] args) {

        String s1 = "Hello";//SCP
        String s5 = "Hello";
        String s2 = new String("Hello");//heap area
        String s3 = new String("hello");
        //String s4 = new String("Hello");

       // System.out.println(s1==s2);
        //System.out.println(s1==s5);
       // System.out.println(s2==s3);
       // System.out.println(s3==s4);

        System.out.println(s1.equals(s2));//compare the values
        System.out.println(s1.equals(s3));//case-sensitive
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
