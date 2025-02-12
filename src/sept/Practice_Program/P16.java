package sept.Practice_Program;

public class P16 {
    public static void main(String[] args)
    {
        String Name = "pramod";
        int Vowels = 0;
        int Consonats = 0;
        for (int i = 0; i < Name.length(); i++)
        {
            if (Name.charAt(i) == 'a' || Name.charAt(i) == 'e' || Name.charAt(i) == 'i' || Name.charAt(i) == 'o' || Name.charAt(i) == 'u')
            {
                Vowels++;
            }
            else
            {
               Consonats++;
            }
        }
        System.out.printf("Number of Vowels in " + Name + " are: " +Vowels);
        System.out.println("\n");
        System.out.printf("Number of Consonants in " + Name + " are: "+Consonats);
    }
}
//Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4