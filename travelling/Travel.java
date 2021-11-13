package travelling;

import java.util.Scanner;

public class Travel{
    public static void main(String[] args){
        City arrayCities[] = new City[100];

        Scanner n = new Scanner(System.in);
        int numOfCities = n.nextInt();

        for (int i = 0; i < numOfCities; i++)
        {
            arrayCities[i].P = n.nextInt();
            arrayCities[i].D = n.nextInt();
            if (arrayCities[i].P < 1 || arrayCities[i].P > 2000000)
                throw new IllegalArgumentException("The price must be within range!!!");
        }

        int ACC=0;
        for (int i = 0; i < numOfCities; i++)
        {
            if (arrayCities[i].D / arrayCities[i].P >= 100)
                ACC++;
        }

        System.out.print(ACC);
        
        for (int i = 0; i < numOfCities; i++)
        {
            if (arrayCities[i].D / arrayCities[i].P >= 100)
                System.out.print(" " + i);
        }
    }
}