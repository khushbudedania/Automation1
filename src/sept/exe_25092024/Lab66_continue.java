package sept.exe_25092024;

public class Lab66_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            {
                System.out.println(i);
                if (i == 5) {
                    continue;
                }
                System.out.println("After");
            }
        }
    }

