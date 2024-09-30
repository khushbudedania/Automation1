package sept.exe_27092024;

public class Lab71_Do_while_loop {
    public static void main(String[] args) {
        //while -> initalization; condition; execution(increment,decrement).
        //do - while -> initalization; execution(increment,decrement); condition.
//        int i = 0;
//        while(i <= 10)
//        {
//            System.out.printf("print"+i);
//            System.out.println("\n");
//            i++;
//        }
//    }
//}
        int i = 0;
        do {
            System.out.printf("print" +i);
            System.out.println("\n");
            i++;
        }
        while (i <= 10);
    }
}

