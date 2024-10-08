package oct.exe_11102024_Encapsulation.Task26;

public class BaseTest_API {
    private int id;
    private String Name;

    public BaseTest_API()
    {
        System.out.println("this is base test dc");
    }

     public BaseTest_API(int id, String name)
    {
        System.out.println("this is base test pc");
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name, boolean is_auth) {
        this.Name = Name;

        if (is_auth) {
            this.Name = Name;
        }
        else
        {
            System.out.println("not allowed");
        }
    }

    String PerformGet() {
        System.out.println("fatch the data");
        return Name;
    }

    String PerformPost() {
        System.out.println("create a data");
        return Name;
    }

    void PerformPatch() {
        System.out.println("partial update the data");

    }

    void PerformPut() {
        System.out.println("update a data");

    }

    void PerformDelete() {
        System.out.println("delete a data");

    }


}
