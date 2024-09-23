package sept.exe_23092024;

public class Lab43_switch_condition {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("no idea");
                break;
        }
        }
    }
// switch only support byte, short, int, long(wrapper class use or convert into int),enum, string.
//char also use because it is integer.('A'= 65)
//We cannot use continue with switch.