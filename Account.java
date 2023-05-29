
package may_22OOPProject;

import static java.lang.Long.parseLong;

public abstract class Account implements BaseInterestRate{
    private String name;
    private String ssn;
    private double balance;
    private String accountNumber;
    private String routingNumber;
    private double interestRate;

    public Account(String name, String ssn, double balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        this.interestRate = getBaseInterestRate();

    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String generateAccountNumber(){
        long num =(long)( 1000000 + Math.random()*9000000);
       return ssn.substring(ssn.length() - 5) +num;
    }

    public String generateRoutingNumber(){
        long num =(long)( 1000000 + Math.random()*9000000);
        String str = 00 + Long.toString(num);
        return str;

    }

    public void deposit(double amount){
        System.out.println("The new balance is " + (balance + amount));
    }

    public void withdraw (double amount) {
        if (amount < balance) {
            System.out.println("The new balance is " + (balance - amount));
        } else{
            System.out.println("Balance is lower than amount you're trying to withdraw");
        }
    }

    public String showInfo() {
        return
                "name='" + name + '\'' +
                ", ssn=" + ssn + '\'' +
                ", accountNumber=" + accountNumber + '\'' +
                ", routingNumber=" + routingNumber +  '\'' +
                        ", balance=" + balance;
    }
}
