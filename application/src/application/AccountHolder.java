package application;

public class AccountHolder extends BankAccount {

    
    private String username;
    private String password;
    private String name;
    private String address;
    private String mobileNumber;
    private double deposit;
    
    
    
    

    public AccountHolder(String username, String password, String name, String address, String mobileNumber, double deposit) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.deposit = deposit;


    }

    
    
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.mobileNumber;
    }
    
    public String getusername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }



    @Override
    double getBalance() {
        // TODO Auto-generated method stub
        return this.deposit += super.balance;
    }
    
    
    public String toString() {
        return this.name +  "\n" + this.address+  "\n" + this.mobileNumber+  "\n" + super.getRandomAccountNumber()+  "\n" + super.getRandomSortcode();
    }
}
