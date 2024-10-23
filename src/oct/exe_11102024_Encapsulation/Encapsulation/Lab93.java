package oct.exe_11102024_Encapsulation.Encapsulation;

public class Lab93 {
    public static void main(String[] args) {
        BadVWOLogin b1 = new BadVWOLogin("khushbu","login123");

        System.out.println(b1.username);
        System.out.println(b1.password);
        b1.password = "khu123456";
        System.out.println(b1.password);


        GoodVWOLogin g1 = new GoodVWOLogin("chirag","login456");
        System.out.println(g1.getPassword());


        g1.setPasword("poojaaaaa",true);

        System.out.println(g1.getPassword());



    }

}
