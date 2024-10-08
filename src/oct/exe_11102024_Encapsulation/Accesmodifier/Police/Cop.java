package oct.exe_11102024_Encapsulation.Accesmodifier.Police;

public class Cop {

    private int gun;
    private String idcard;


    public Cop(int gun) {
        this.gun = gun;
    }
      protected  void canishoot()
        {
            System.out.println("yes you can");
        }

    }
