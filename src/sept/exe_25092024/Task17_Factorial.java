package sept.exe_25092024;

public class Task17_Factorial {
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
        for(int i=1;i<=5;i++)
        {
            factorial=factorial*i;

        }

        System.out.println("Factorial of "+num+ " is " +factorial);
    }
}
//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
//n = 1 ->  Fact = 1*1 -> 1
//n = 3 -> Fact = 3*2*1 -> 6