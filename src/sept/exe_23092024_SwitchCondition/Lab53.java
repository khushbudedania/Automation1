package sept.exe_23092024_SwitchCondition;

public class Lab53 {
    public static void main(String[] args) {
        char c = 'A';

        switch(c)
        {
            case 'A'+1:
                System.out.println("print A");
                System.out.println("print A");
                 break;
//            case 'A'+1:
//                System.out.println("print A");
//                System.out.println("print A");
//                break;
            case 65 :
                System.out.println("print 65");
                System.out.println("print 65");
                break;
        }
    }
}
//Multiple statement allow in switch but not same expression allow in it.