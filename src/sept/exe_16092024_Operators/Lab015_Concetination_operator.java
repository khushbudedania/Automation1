package sept.exe_16092024_Operators;

public class Lab015_Concetination_operator {
    public static void main(String[] args)
    {
        String first_name = "khushbu";
        String last_name = "dedania";
        System.out.println(first_name+'\t'+last_name);

        int a = 10;
        int b = 10;

        System.out.println(first_name+last_name+a+b);//first is string then they do the concetination.
        System.out.println(a+b+first_name+last_name);//if first is int then they do the addition.
        System.out.println(first_name+last_name+(a+b));//if you use the bracket then they do the addition.
    }
}
