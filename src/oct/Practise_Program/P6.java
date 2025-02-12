package oct.Practise_Program;

public class P6 {
    public static void main(String[] args) {
        int n1 = 5;

        for(int i = 0; i < n1; i++)
        {
            for (int j = 0; j < n1-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//✅ Left Triangle Star Pattern
//*****
//****
//***
//**
//*


