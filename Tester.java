package may_22OOPProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static may_22OOPProject.Utility.readFromCSV;

public class Tester {

    public static void main(String[] args) {


        String answer;
        do{

        List<Account> accounts = new ArrayList<>();

        System.out.println("Please enter the name of the file to load: ");

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        System.out.println("==================================================");
        System.out.println("All info has been loaded and accounts are being created...");
        System.out.println("==================================================");


        List<List<String>> accountLists = readFromCSV(fileName);

        for(List<String> row : accountLists) {
            String name = row.get(0);
            String ssn = row.get(1);
            String accountType = row.get(2);
            double balance = Double.parseDouble(row.get(3));

            if (accountType.equals("Checking")){
                Checking checking = new Checking(name, ssn, balance);
                accounts.add(checking);

        } else if(accountType.equals("Savings")){
                Savings savings = new Savings(name, ssn, balance);
                accounts.add(savings);
            }

        }

        System.out.println("Here's the list of bank accounts that have been created: ");
        for (Account account : accounts) {
            System.out.println(account.showInfo());
        }

        System.out.println("Would you like to load another file(yes/no): ");
         answer = scan.nextLine();


        } while (answer.equals("yes"));





    }
}
