package oct.exe_14102024_Abstraction.Task27;

public abstract class BOOK {

    String Name;
    String Author;
    int price;

    abstract void getdetails();

    public BOOK(String name, String author, int price) {
        Name = name;
        Author = author;
        this.price = price;
    }
}
