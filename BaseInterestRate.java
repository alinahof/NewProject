package may_22OOPProject;

public interface BaseInterestRate {

     double BASE_INTEREST_RATE = 2.5;

     default double getBaseInterestRate(){
         return BASE_INTEREST_RATE;
     }

     double setInterestRate();


    //String showInfo();
}
