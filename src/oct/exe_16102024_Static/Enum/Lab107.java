package oct.exe_16102024_Static.Enum;

public class Lab107 {
    public static void main(String[] args) {
        System.out.println(Color.red.hexcode);
        System.out.println(Color.red.getHexcode());

        if(Color.red.getHexcode() == "#800000");
        {
            System.out.println("color is red");
        }


    }

    enum Color{
        red("#800000"),
        blue("22234");

        private String hexcode;

       private Color(String hexcode) {
            this.hexcode = hexcode;
        }

        public String getHexcode() {
            return hexcode;
        }


    }

}
