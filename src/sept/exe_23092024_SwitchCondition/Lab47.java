package sept.exe_23092024_SwitchCondition;

public class Lab47 {
    public static void main(String[] args) {
        long Itemcode = 006l;

        switch((int) Itemcode)
        {
            case 001 -> System.out.println("this is mech. gadgets");
            case 003 -> System.out.println("this is com. gadgets");
            case 005 -> System.out.println("this is ele. gadgets");
             default -> System.out.println("this is other. gadgets");

        }
    }
}
// switch directly long not supported so convert into it int.
// (->) is a break