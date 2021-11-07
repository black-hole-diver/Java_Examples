// main thing: array in Java

import java.util.*;

public class LotteryDrawing{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = input.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            int r = (int) (Math.random() * n); // Math.random()
            result[i] = numbers[r];

            numbers[r] = numbers[n-1];
            n--;
        }

        Arrays.sort(result);

        System.out.println("Bet the following conbination. It will make you rich!");

        for (int r : result)
            System.out.println(r);

    }
}