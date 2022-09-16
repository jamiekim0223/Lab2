//NAME - Jamie Kim 3rd Period

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;
        String stringOne, stringTwo;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.print("Enter a 2 digit number :: ");
        doubleOne = keyboard.nextDouble();

        System.out.print("Enter another 2 digit number :: ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter an 3 digit number :: ");
        shortOne = keyboard.nextShort();

        System.out.print("Enter another 3 digit number :: ");
        shortTwo = keyboard.nextShort();

        System.out.print("Enter your favorite word :: ");
        stringOne = keyboard.nextLine();

        keyboard.nextLine();

        System.out.print("Enter your name :: ");
        stringTwo = keyboard.nextLine();



        //add in input for all variables
        System.out.println("Enter a slightly larger number");
        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("Your two digit number is " + doubleOne);
        System.out.println("Your second two digit number is " + doubleTwo);
        System.out.println("Your three digit number is "+ shortOne);
        System.out.println("Your second three digit number is " + shortTwo);
        System.out.println("Your favorite word is " + stringOne);
        System.out.println("Your name is " + stringTwo);


        //add output for all variables


    }
}