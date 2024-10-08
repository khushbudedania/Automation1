package oct.exe_11102024_Encapsulation.Super_Keyword.Ex1;

public class Testcase1 extends Base_class{

    Testcase1()
    {
        super();
        System.out.println("this is a testcase1 dc");
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean is_auth) {
        super.setBrowser(browser, is_auth);
    }


}
