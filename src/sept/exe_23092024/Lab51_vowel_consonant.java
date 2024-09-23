package sept.exe_23092024;

public class Lab51_vowel_consonant {
    public static void main(String[] args) {
        char c = 'p'; //vowel or consonant

        switch(c){
            case 'a', 'e','i','o','u':
                System.out.println("this is vowels");
                break;
            default:
                System.out.println("This is consonant");
                break;
        }

    }
}
