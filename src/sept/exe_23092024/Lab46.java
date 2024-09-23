package sept.exe_23092024;

public class Lab46 {
    public static void main(String[] args) {
        int Itemcode = 002;

        switch(Itemcode){
            case 001,002,003:
                System.out.println("this is all mech. gadgets");
                break;

            case 004,005,006:
                System.out.println("this is all elec. gadgets");
                break;

            default:
                System.out.println("none");
                break;
        }
    }
}
