package oct.Practise_Program;

public class P5 {
    public static void main(String[] args) {
        String s1 = "khushbu";
        String reverse  = "";
        char a[] = s1.toCharArray();
        for (int i = a.length - 1; i >= 0; i--)
        {

            reverse = reverse + s1.charAt(i);

        }
        System.out.println(reverse);
        if(s1.equals(reverse))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }

    }
}
//String
//(==) is always compare the scp location.
//(equals) is always check the value.


//Palindrome
//
//Input : str = "abba"
//Output: Yes
//
//Input : str = "pramod"
//Output: No