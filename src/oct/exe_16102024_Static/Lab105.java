package oct.exe_16102024_Static;

public class Lab105 {
    public static void main(String[] args) {
      ATB a1 = new ATB("khushbu");
      ATB a2 = new ATB("khushbu");
      a1.ReadDocuments();
      a2.ReadDocuments();
      ATB.doassighnments();
      String Coursename = ATB.Course_Name;
      System.out.println("Coursename = " + Coursename);

    }

    static class ATB
    {
        {
            System.out.println("IIB");
        }
     static
     {
            System.out.println("SIB");
     }
      private String Name;
      static String Course_Name = "ATB8X";
      private Long Phone_No;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public ATB(String name) { //para. constractor
            this.Name = name;

        }

        void ReadDocuments()
        {
            System.out.println("this is non static method");

        }
        static void doassighnments()
        {
            System.out.println("static method");
        }
    }

}
