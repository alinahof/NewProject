package may_22OOPProject;

public class Savings extends Account{
    private int safetyDepositBoxID;
    private int safetyDepositBoxPin;
    private String accountNumber;

    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
         this.accountNumber = 2 + generateAccountNumber();
        this.safetyDepositBoxID = (int)(Math.random()*1000);
        this.safetyDepositBoxPin = (int)(Math.random()*10000);
        setInterestRate();
    }

    public int getSafetyDepositBoxID() {
        return safetyDepositBoxID;
    }

    public int getSafetyDepositBoxPin() {
        return safetyDepositBoxPin;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double setInterestRate() {
        double interestRate = getBaseInterestRate() - 0.25;
        return interestRate;
    }

    @Override
    public String showInfo() {
        return " name= " + getName() +
                "\n ssn=" + getSsn() +
                "\n accountNumber= " + getAccountNumber() +
                "\n routingNumber= " + getRoutingNumber() +
                "\n balance= " + getBalance() +
                "\n Account type: Savings" +
                "\n SAFETY DEPOSIT BOX ID: " + getSafetyDepositBoxID() +
                "\n SAFETY DEPOSIT BOX PIN: " + getSafetyDepositBoxPin() +
                "\n interest rate " + setInterestRate()+
                "\n======================================";
    }
}
