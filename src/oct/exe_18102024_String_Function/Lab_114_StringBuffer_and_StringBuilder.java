package oct.exe_18102024_String_Function;

public class Lab_114_StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("KHUSHBU");
        StringBuffer stringBuffer1 = new StringBuffer("CHIRAG");
        stringBuffer.append("DEDANIA");
        stringBuffer1.append("DEDANIA");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);


        StringBuilder stringBuilder = new StringBuilder("MYRA");
        stringBuilder.append("DEDANIA");
        System.out.println(stringBuilder);

        //INSERT
        stringBuilder.insert(5,",");
        System.out.println(stringBuilder);

        //Delete
        stringBuilder.delete(4,6);
        System.out.println(stringBuilder);

        //Reverse
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
//STRINGBUFFER:-
//Mutable, Unlike `String` , which is immutable, `StringBuffer`  allows modifications to its content.
//Thread-Safe, `StringBuffer`  methods are synchronized, making it safe for use in multi-threaded environments.
// This means that multiple threads can access a `StringBuffer`  instance without corrupting its state.

//STRINGBUILDER:-
//Mutable Like StringBuffer, StringBuilder allows modifications to its content.
//Not Thread-Safe, StringBuilder is not synchronized, making it faster than StringBuffer in single-threaded
//scenarios. It is suitable for use when thread safety is not a concern.