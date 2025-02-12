package oct.Practise_Program;

public class P1 {
    public static class BaseTest
    {
        private int id;
        private String name;

        BaseTest()
        {

            System.out.println("this is basetest dc");
        }

        public BaseTest(int id, String name)
        {
            this.id = id;
            this.name = name;
            System.out.println("this is basetest pc");
        }

        public int getId() {
            return id;
        }

        public void setId(int id, boolean is_auth)
        {
           if(is_auth) {
               System.out.println("allowed");

               this.id = id;
           }
           else
           {
               System.out.println("not allowed");
           }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void performGET()
        {
            System.out.println("this is GET method");

        }
        public static String performPOST(String Firstname)
        {
            System.out.println("this is POST method");
            return "khushbu";
        }
        public static String performPUT()
        {
            System.out.println("this is PUT method");
            return "myra";
        }
        public static void performPATCH(String Lastname)
        {
            System.out.println("this is PATCH method");
        }
        public static void performDELETE()
        {
            System.out.println("this is DELETE method");
        }
        public void performDELETE(int id)
        {
            System.out.println("this is DELETE method");
            this.id= id;
        }
    }

    public static class ApiAutomation {
        public static void main(String[] args)
        {
           Testcase t1 = new Testcase(12,"dedania");
           int number =  t1.no;
           String lsat = t1.lastname;
           System.out.println(number);
           System.out.println(lsat);

          BaseTest b1 = new Testcase();
          b1.performDELETE(12);
          b1.setId(15,true);
          System.out.println(b1.getId());



        }
    }

    public static class Testcase extends BaseTest {
        int no;
        String lastname;

        public Testcase()
        {
            System.out.println("this is testcase dc");

        }

        public Testcase(int no,String lastname)
        {
            super();
            System.out.println("this is testcase pc");
            this.no = no;
            this.lastname = lastname;
        }

        @Override
        public int getId()
        {
            return super.getId();
        }
    }
}
