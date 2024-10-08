package oct.exe_18102024_String_Function;

public class Lab112_String_Functions {
    public static void main(String[] args) {
        String S1 = " Hello World ";
        String S2 = " Hello World ";


        //Length of the String
        System.out.println("Length: " + S1.length());

        //substring of a string
        System.out.println("substring:"+ S1.substring(1,5));

        //Trim(remove the space from front and last)
        System.out.println("Trim:"+ S1.trim());

        //uppercase
        System.out.println("uppercase:" + S1.toUpperCase());

        //lowercase
        System.out.println("Lowercase:" + S1.toLowerCase());

        //they give the character at no.5 position
        System.out.println("position:" + S1.charAt(5));


        //equals
        System.out.println("Equals:" + S1.equals("hello"));

        //they give the no where e is located
        System.out.println("indexof:" + S1.indexOf("e"));

        //
        System.out.println("Contains:" + S1.contains("p"));

        //
        System.out.println("empty:" + S1.isEmpty());

        //comparison two strings.
        System.out.println("comparison " + S1.compareTo(S2));//they return 0 if both the string is same.
                                                            // otherwise it return diff. using ascii value.

        //it removes spaces from front and last.
        System.out.println("Strip = " + S1.strip());

    }
}
