package oct.exe_18102024_String_Function;

public class Lab110 {
    public static void main(String[] args) {

        String s1 = "Hello";//SCP
        String s5 = "Hello";
        String s2 = new String("Hello");//heap area
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s2==s3);
        System.out.println(s3==s4);

        //how can i check the values?
        //then use the equals() operator.
        System.out.println(s1.equals(s2));//compare the values
    }
}
//(==) always check the reference location is same or not rather than the values.
//(equals)for comparing the values always use.
//In string they always check the reff. location.(memory location)
//in int they always check the value.