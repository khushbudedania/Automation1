package sept.exe_20092024;

public class Lab42 {
    public static void main(String[] args) {
        //char grade = 'F';
        int Score = 80;
        if (Score>=90 && Score<=100)
        {
            System.out.println("grade A");
        }
        else if (Score>=80 && Score<=89)
        {
            System.out.println("grade B");
        }
        else if (Score>=70 && Score<=79)
        {
            System.out.println("grade C");
        }
        else if (Score>60 && Score<=69)
        {
            System.out.println("grade C");
        }
        else if (Score>=50 && Score<=59)
        {
            System.out.println("grade D");
        }
        else
        {
            System.out.println("FAIL");
        }

    }
}
