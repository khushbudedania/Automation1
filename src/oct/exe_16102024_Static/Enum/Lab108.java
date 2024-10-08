package oct.exe_16102024_Static.Enum;

public class Lab108 {
    public static void main(String[] args) {
     System.out.println(Apiconstantsendpoints.BASE_URL.getName());
    }

    enum Apiconstantsendpoints{

         BASE_URL("https://app.vwo.com");

        private String Name;

        Apiconstantsendpoints(String name) {
            this.Name = name;
        }

        public String getName() {
            return Name;
        }


        }

}
