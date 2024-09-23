package sept.exe_23092024;

public class Task14_month_using_switch {
    public static void main(String[] args) {
        int month_no = 12;

        switch(month_no){
            case 1:
                System.out.println("JANUARY");
                break;

            case 2:
                System.out.println("FEBRUARY");
                break;

            case 3:
                System.out.println("MARCH");
                break;

            case 4:
                System.out.println("APRIL");
                break;

            case 5:
                System.out.println("MAY");
                break;

            case 6:
                System.out.println("JUNE");
                break;

            case 7:
                System.out.println("JULY");
                break;

            case 8:
                System.out.println("AUGUST");
                break;

            case 9:
                System.out.println("SEPTEMBRE");
                break;

            case 10:
                System.out.println("OCTOMBER");
                break;

            case 11:
                System.out.println("NOVEMBER");
                break;

            case 12:
                System.out.println("DECEMBER");
                break;

            default:
                System.out.println("NOT MATCH FOUND");
                break;
        }
    }
}

//Write a program that takes an integer input (1-12) and
// prints the name of the corresponding month using a switch statement.
//Input  - 12
//Out - Dec.