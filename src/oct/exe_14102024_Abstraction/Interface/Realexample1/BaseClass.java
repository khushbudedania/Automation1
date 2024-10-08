package oct.exe_14102024_Abstraction.Interface.Realexample1;



public class BaseClass extends GrandBaseClass {
    @Override
    void OpenBrowser(String Browser) {
       System.out.println("open browser");
        // super.OpenBrowser(Browser);
    }

    @Override
    void CloseBrowser(String Browser) {
        System.out.println("close browser");
        //super.CloseBrowse(Browser);
    }

    @Override
    void takescreenshot() {
        System.out.println("taking screenshot");

    }
}
