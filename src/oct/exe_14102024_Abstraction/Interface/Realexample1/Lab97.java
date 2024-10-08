package oct.exe_14102024_Abstraction.Interface.Realexample1;

public class Lab97 {
    public static void main(String[] args) {
        ChromeTC C1 = new ChromeTC();
        Firefox_TC f1 = new Firefox_TC();


        C1.OpenBrowser("chrome");
        C1.CloseBrowser("chrome");
        C1.takescreenshot();

        f1.OpenBrowser("Firefox");
        f1.CloseBrowser("Firefox");
    }

}
