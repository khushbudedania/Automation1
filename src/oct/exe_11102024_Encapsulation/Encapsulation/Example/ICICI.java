package oct.exe_11102024_Encapsulation.Encapsulation.Example;

public class ICICI {

    private String Name;
    private int Balance;

    public ICICI(String name, int balance) {
        Name = name;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;

    }

    public void setBalance(int Balance, boolean isadmin) {
        if (isadmin) {
            this.Balance = Balance;
            System.out.println("allowed");
        } else {
            System.out.println("not allowed");
        }

    }
}