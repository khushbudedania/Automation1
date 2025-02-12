package sept.Practice_Program;

public class P5 {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score>=90)? "A": (score>=80)? "B": (score>=70)? "C":(score>=60)? "D": "F";
        System.out.println(grade);



    }
}

//Ternary Operators to handle multiple conditions.
//Input → int score = 85
//String grade →
//score >= 90 → A
//score >= 80 → B
//score >= 70 → C
