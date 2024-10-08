package oct.exe_11102024_Encapsulation.Task26;

public class API_Automation {
    public static void main(String[] args) {
        BaseTest_API T1 = new TestCase_API();
        T1.PerformGet();
        T1.PerformPost();
        T1.PerformPut();
        T1.PerformDelete();
        T1.PerformPatch();


        T1.setName("CHIRAG",false);
        T1.setId(50);

        System.out.println("set id ->"+ T1.getId());
        System.out.println("set id ->"+ T1.getName());



    }
}
