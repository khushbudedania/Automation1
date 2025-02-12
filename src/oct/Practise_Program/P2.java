package oct.Practise_Program;

public class P2 {
    public abstract static class B1 {
        String book_name;
        String Book_Author;
        String price;

        public B1(String book_name, String book_Author, String price)
        {
            this.book_name = book_name;
            this.Book_Author = book_Author;
            this.price = price;
        }

        abstract void getDetails();
    }

    public static class B2 extends B1

    {
        public B2(String book_name, String book_Author, String price)
        {
            super(book_name, book_Author, price);
        }
        @Override
        void getDetails()
        {
            System.out.println(book_name);
            System.out.println(Book_Author);
            System.out.println(price);

        }
    }
    public static class B3 {

        public static void main(String[] args) {

            B1 book = new B2("Harry Potter","hgydy","1000");
            book.getDetails();
        }
    }
}
//if parent class have constractor then child class also have constractor.
//you can't create object of abstract class.