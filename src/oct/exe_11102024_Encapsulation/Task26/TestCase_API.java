package oct.exe_11102024_Encapsulation.Task26;

public class TestCase_API extends BaseTest_API {
   // String Name1 = "KHUSHBU";

    TestCase_API()
    {
        super();
        System.out.println("this is dc of testcase_api class");

    }
    TestCase_API(String Name1)
    {

        System.out.println("this is pc of testcase_api class");

    }

    @Override
    public void setName(String Name, boolean is_auth) {
        super.setName(Name, is_auth);
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    String PerformGet() {
        return super.PerformGet();
    }

    @Override
    String PerformPost() {
        return super.PerformPost();
    }

    @Override
    void PerformPatch() {
        super.PerformPatch();
    }

    @Override
    void PerformPut() {
        super.PerformPut();
    }

    @Override
    void PerformDelete() {
        super.PerformDelete();
    }


}
