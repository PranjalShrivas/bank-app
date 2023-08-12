import java.util.UUID;

public class HDFCaccount implements BankAccountInterface{

    private String name;

    private String accountNo; // unique

    private String password;

    private double balance;

    final double rateOfInterest=7.1;

    final String IFSCCode="HDFCC43895";
    public HDFCaccount(){

    }

    public HDFCaccount(String name, String password,double balance){
        this.name=name;
        this.password=password;
        this.balance=balance;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your balance is: "+this.balance;
        }
        return "Incorrect password!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance+=amount;
        return "Amount added successfully. New balance is "+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password))
        {
            if(this.balance<amount) return "Insufficient Balance";

            this.balance-=amount;
            return "Amount deducted successfully. New balance "+this.balance;
        }
        return "Incorrect Password!!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword))
        {
            this.password=newPassword;
            return "Password changed successfully";
        }

        return "Incorrect original password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*this.rateOfInterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCaccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }

    // This is a change in line.
}
