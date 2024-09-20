package sept.exe_20092024;

public class Task9 {
    public static void main(String[] args) {
        int score = 77;
        String grade = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" : "F";
         System.out.println("grade is:"+grade);
    }
}

//✅ Ternary Operators to handle multiple conditions.
//
//// Input → int score = 85
//
//// String grade →
//
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C