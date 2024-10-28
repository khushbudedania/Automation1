package oct.exe_23102024_Exception;

public class Lab134_Custom_Exception
{
  /* public static void main(String[] args) throws Exception{
        Bank bank = new Bank(100,"INR");
        Bank bank1 = new Bank(200,"INR");
        Bank bank2 = new Bank(200,"dollar");
        System.out.println(bank.Add(bank1));
        System.out.println(bank.Add(bank2));

    }*/
}

/*
class Bank {
    private String Currency;
    private int Amount;

    public Bank(int amount, String currency) {
        Amount = amount;
        Currency = currency;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int Add(Bank bank_name) {
        if (!bank_name.Currency.equalsIgnoreCase("INR"))
            try {
                throw new Exception("cuurency mismatch");
            } catch (Exception e) {
                System.out.println("exception");
            }
        else {
            return this.Amount + bank_name.Amount;

        }

    }*/