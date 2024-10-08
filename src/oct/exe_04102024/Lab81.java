package oct.exe_04102024;

public class Lab81  {
    public static void main(String[] args) {
        Ahuman amit = new Ahuman();
        Ahuman khushbu = new Ahuman("myra");
        new Ahuman();


        System.out.println(amit.Name);// because we dont set any value for amit so that they can take null.b ecause string default value is null.
        System.out.println(khushbu.Name);

    }
}
