package oct.exe_11102024_Encapsulation.Encapsulation.Example;

public class Lab94 {
    public static void main(String[] args) {
        ICICI khushbu = new ICICI("khushi",123456);

        System.out.println(khushbu.getBalance());
        boolean isadmin =  false;
        khushbu.setBalance(456789,isadmin);
        System.out.println(khushbu.getBalance());


    }
}
