package sept.exe_18092024;

public class Lab24_Type_casting {
    public static void main(String[] args) {
        long phone_no = 1234567891l;
       // short no = phone_no; //narrowing with implicit casting (loss)
        short no1 = (short) phone_no;//narrowing with explicit casting (loss)
        System.out.println(no1);

    }
}
// byte b = 10;
//int a = b; widenning with implicit casting (lossless)
//int a1 = (int) b; widenning with explicit casting (lossless)