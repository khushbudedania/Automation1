package sept.Practice_Program;

public class P13 {
    public static void main(String[] args) {
        int n = 5;
        int factorial= 1;
        for(int i = 1; i <= 5; i++)
        {
             factorial = i * factorial;
        }
        System.out.printf("Factorial of %d is = " +factorial ,n);

    }

}
//Factorial Program - n = 5 , Output = 120
//  n = 5 ->  Fact = 5*4*3*2*1 = 120
//n = 1 ->  Fact = 1*1 -> 1
//n = 3 -> Fact = 3*2*1 -> 6