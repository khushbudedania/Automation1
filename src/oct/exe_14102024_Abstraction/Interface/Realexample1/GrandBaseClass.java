package oct.exe_14102024_Abstraction.Interface.Realexample1;

 abstract class GrandBaseClass {
    void OpenBrowser(String Browser)
    {
        System.out.println("open the Browser");
    }
    void CloseBrowser(String Browser)
    {
        System.out.println("close the browser");
    }
     abstract void takescreenshot();

}
