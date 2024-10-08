package oct.exe_14102024_Abstraction.Interface.Realexample1;

public class ChromeTC extends BaseClass {
    @Override
    void OpenBrowser(String Browser) {
        System.out.println("open the chrome browser");
       // super.OpenBrowser(Browser);
    }

    @Override
    void CloseBrowser(String Browser) {
        System.out.println("close the chrome browser");
        //super.CloseBrowse(Browser);
    }
}
