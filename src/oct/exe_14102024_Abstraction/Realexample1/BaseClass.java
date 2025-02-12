package oct.exe_14102024_Abstraction.Realexample1;

public class BaseClass extends GrandBaseClass {
    @Override
    void OpenBrowser(String Browser) {
       System.out.println("open browser");
        // super.OpenBrowser(Browser);
    }

    @Override
    void CloseBrowser(String Browser)
    {

        System.out.println("close browser");
        super.CloseBrowser(Browser);
    }

    @Override
    void takescreenshot() {
        System.out.println("taking screenshot");

    }
}
