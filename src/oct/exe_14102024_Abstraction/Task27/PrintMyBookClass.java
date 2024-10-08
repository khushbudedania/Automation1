package oct.exe_14102024_Abstraction.Task27;

public class PrintMyBookClass extends BOOK {



    public PrintMyBookClass(String name,String author,int price)
    {
        super(name,author,price);
    }

    @Override
    void getdetails()
    {
         System.out.println("book name");
    }

    }
