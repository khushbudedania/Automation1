package sept.exe_23092024;

public class Lab47 {
    public static void main(String[] args) {
        int Itemcode = 006;

        switch(Itemcode){
            case 001 -> System.out.println("this is mech. gadgets");
            case 003 -> System.out.println("this is com. gadgets");
            case 005 -> System.out.println("this is ele. gadgets");
             default -> System.out.println("this is other. gadgets");

        }
    }
}
// (->) is a break