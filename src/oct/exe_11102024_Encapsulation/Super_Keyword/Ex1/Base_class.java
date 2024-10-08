package oct.exe_11102024_Encapsulation.Super_Keyword.Ex1;

public class Base_class {

    private String browser;

    public Base_class()
    {
        System.out.println("this is base class dc");
    }
    public Base_class(String b)
    {
        System.out.println("this is base class pc");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean is_auth) {
        this.browser = browser;
        if (is_auth) {
            this.browser = browser;
        }
        else
        {
            System.out.println("not allowed");
        }
    }
        void OpenBrowser()
        {
            System.out.println("open browser");
        }
        void OpenBrowser(String browserName)
        {
            System.out.println("browser_name ->"+ browserName);
        }
        void CloseBrowser()
        {
            System.out.println("close browser");
        }


    }

