package sept.exe_23092024;

public class Lab44 {
    public static void main(String[] args) {
        String browser = "gbh";
        switch(browser){
            case "chrome":
                System.out.println("starting the chrome browser");
                break;

            case "opera":
                System.out.println("starting the opera browser");
                break;

            case "firefox":
                System.out.println("staring the firefox browser");
                break;

            case "edge":
                System.out.println("starting the edge browser");
                break;

            default:
                System.out.println("I have not idea which browser is this");
        }


    }
}
