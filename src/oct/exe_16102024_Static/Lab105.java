package oct.exe_16102024_Static;

public class Lab105 {
    public static void main(String[] args)
    {
      ATB a1 = new ATB("khushbu",123456);
      ATB a2 = new ATB("khushbu",123456789);
      System.out.println(a1.Name +"  "+ a1.Phone_No);
      System.out.println(a2.Name +"  "+ a2.Phone_No);
      a1.ReadDocuments();
      a2.ReadDocuments();
      ATB.do_assighnments();
      String Coursename = ATB.Course_Name;
      System.out.println("Coursename = " + Coursename);

    }

    static class ATB
    {
        private String Name;
        private Long Phone_No;
        static String Course_Name = "ATB8X";

        {
            System.out.println("IIB");
        }
        static
        {
            System.out.println("SIB");
        }

        public Long getPhone_No() {
            return Phone_No;
        }

        public void setPhone_No(Long phone_No) {
            this.Phone_No = phone_No;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public ATB(String name,long phone_No) //para. constractor
        {
            this.Name = name;
            this.Phone_No = phone_No;

        }

        void ReadDocuments()
        {
            System.out.println("this is non static method");

        }
        static void do_assighnments()
        {
            System.out.println("static method");
        }
    }

}
