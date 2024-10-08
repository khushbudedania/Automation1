package oct.exe_14102024_Abstraction.Task27;

public class RunnerClass {
    public static void main(String[] args) {
        BOOK mybook = new PrintMyBookClass("Harry_Potter","pppp",100);//Dynamic Dispatch

       String Book_Name =  mybook.Name;
       String Book_Author = mybook.Author;
       int Book_Price = mybook.price;

        System.out.println("Book_Name = " + mybook.Name);
        System.out.println("Book_Author = " + mybook.Author);
        System.out.println(" Book_Price = " + mybook.price);


    }
}
