package oct.Practise_Program;

public class P10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int min_value = array[0];

        for (int i = 1; i< array.length;i++)
        {
            if(array[i] < min_value)
            {
                min_value = array[i];
            }
        }
        System.out.println(min_value);
    }
}
