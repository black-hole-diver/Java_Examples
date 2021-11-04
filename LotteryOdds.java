import java.util.*;

public class LotteryOdds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How much number do you need to draw? ");
        int k = input.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = input.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + i) / i; // binomial coefficient

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good Luck!~");
    }
}