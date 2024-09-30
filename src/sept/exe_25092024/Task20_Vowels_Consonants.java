package sept.exe_25092024;

public class Task20_Vowels_Consonants {
    public static void main(String[] args)
    {
      String s1 = "khushbu_dedania";
      int vowels =0;
      int consonants = 0;
      for(int i = 0; i < s1.length(); i++)
      {
          if(s1.charAt(i) == 'a'|| s1.charAt(i) =='e'||s1.charAt(i) == 'i'|| s1.charAt(i) =='o'|| s1.charAt(i) == 'u')
          {
              vowels++;
          }
          else
          {
              consonants++;
          }
      }
      System.out.printf("Number of Vowels in " +s1 +" are: "+vowels );
      System.out.println("\n");
      System.out.printf("Number of Consonants in " +s1 +" are: "+consonants );

    }
}