package sept.Practice_Program;

public class P18 {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i<=100)
        {
            result = i + result;
            i++;
        }
        System.out.println("sum of no = " +result);
    }


}
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop