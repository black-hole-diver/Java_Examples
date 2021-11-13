import java.util.*;

public class Scanner_Code{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?\n");
        String name = input.nextLine();

        System.out.print("How old are you?\n");
        int age = input.nextInt();

        System.out.print("Your name is: " + name + "\nYou are " + age + " years old.\nNext year you will be " + (age+1) + " years old.\n");
    
    }
}