package may_22OOPProject;

import java.util.Random;

import static java.lang.Long.parseLong;

public class Checking extends Account{

    private String debitCardNo;
    private int debitCardPIN;
    private String accountNumber;

    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);

        this.accountNumber = 1 + generateAccountNumber();
        this.debitCardNo = generateDebitCardNo();
        this.debitCardPIN = (int)(Math.random()*10000);
        setInterestRate();

    }


    @Override
    public double setInterestRate() {
        double interestRate = 0.15 * getBaseInterestRate();
        return interestRate;
    }

    public String generateDebitCardNo(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public int getDebitCardPIN() {
        return debitCardPIN;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String showInfo() {
        return " name='" + getName() +
                "\n ssn=" + getSsn()  +
                "\n accountNumber= " + getAccountNumber() +
                "\n routingNumber= " + getRoutingNumber() +
                "\n balance= " + getBalance() +
                "\n Account type: Checking" +
                "\n debitCardNo= " + getDebitCardNo() +
                "\n debitCardPIN= " + getDebitCardPIN() +
                "\n interest rate " + setInterestRate() +
                "\n==========================";
    }
}
