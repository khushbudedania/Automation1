package sept.exe_18092024;

public class Lab25 {
    public static void main(String[] args) {
        int course = 100;
        float Gst = 18.45f;

        int total_price = course + (int)Gst; // narrowing by explicit casting (loss)
        System.out.println(total_price);
    }
}
