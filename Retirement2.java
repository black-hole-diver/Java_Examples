import java.util.*;

public class Retirement2{
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
        String opinion;

        do{
            balance += payment;
            double interest = balance * interest_rate / 100;
            balance += interest;
            years++;

            System.out.printf("After year %d, your balance is %.2f%n", years,balance);

            System.out.print("Ready to retire? (Y/N)\n");
            opinion = input.next();

        }while(opinion.equals("N"));

        //System.out.println("You need to work for " + years + " to retire.\nAnd " + balance + " will be in your bank account.");
    }
}