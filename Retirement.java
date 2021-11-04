import java.util.*;

public class Retirement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = input.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = input.nextDouble();

        System.out.print("Interest rate in %? ");
        double interest_rate = input.nextDouble();
        
        double balance = 0;
        int years = 0;

        do{
            balance += payment;
            double interest = balance * interest_rate / 100;
            balance += interest;
            years++;
        }while(balance < goal);

        System.out.println("You need to work for " + years + " to retire.\nAnd " + balance + " will be in your bank account.");
    }
}