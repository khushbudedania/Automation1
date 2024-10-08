package oct.exe_11102024_Encapsulation.Encapsulation;

public class GoodVWOLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password = password;
    }

    public void setPasword(String Password,boolean is_auth){
    if(is_auth)
    {
        this.password = password;
        System.out.println("Allowed to access");
        this.setPassword("poojaaaaa");
    }
    else
    {
        System.out.println("not allowed");
    }
    }
    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;








    }
}
