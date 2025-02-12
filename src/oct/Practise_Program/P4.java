package oct.Practise_Program;

public class P4 {
    public static void main(String[] args)
    {
        String s1 = "apple";
        String revString = "";
        char a[] = s1.toCharArray();
        for (int i = a.length-1; i >= 0; i--)
        {
            revString = revString + s1.charAt(i);

        }
        System.out.println(revString);
        }
    }
//Reverse the String without using the any functions. (for loop)