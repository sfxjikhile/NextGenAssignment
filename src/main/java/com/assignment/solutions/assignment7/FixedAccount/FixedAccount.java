package chuks.assignment.FixedAccount;

public class FixedAccount {

   public double calculateInterest() {
       double interest ;

       int principle = 300;
       double  time = 5.4;
       double rating = 1.5;

       interest = principle * rating * time;

       return interest;

   }

}
