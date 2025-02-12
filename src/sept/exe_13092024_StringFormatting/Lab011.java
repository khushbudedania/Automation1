package sept.exe_13092024_StringFormatting;

public class Lab011 {
    public static void main(String[] args) {
        // boolean literals
        boolean is_amit_married = true;
        boolean is_amita_married = false;

        //integer literals
        int age = 34;
        int binary_num = 0b101;
        int octal_num = 0101;
        int hexadecimal_num = 00101;

        //char literals
        char a1 = 'a';  // single character.

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("khushbu"+ new_line+ "dedania");
        System.out.println("khushbu"+ '\t'+ "dedania");
        System.out.println("khushbu"+ '\b'+ "dedania");//remove last char
        System.out.println("khushbu"+ '\r'+ "dedania");//remove khushbu(whole string)

        //null literals (only use with non-primitive type of data types.)

        String s1 = "khushbu";
        Enum e1 = null;
    }
}
