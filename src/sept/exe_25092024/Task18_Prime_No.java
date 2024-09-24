package sept.exe_25092024;

public class Task18_Prime_No {
    public static void main(String[] args) {

        for (int i = 1; i<=100; i++)
        {
            int result = 0;
            for(int j = i; j>=1; j--) {
                if (i%j == 0) {
                    result++;
                }
            }
            if(result==2)
            {System.out.println(i);}
        }
    }
}
//Prime Number from 1 to 100. (for loop)