package examples;

import java.util.Scanner;

public class ExampleWhileLoop {

    public void example1() {

        Scanner scanner = new Scanner(System.in);

        String countryName = "";

        while(!countryName.equals("Estonia")) {
            System.out.println("Guess the country I live in?:");

            countryName = scanner.nextLine();
            System.out.println("You entered: " + countryName);

            if (countryName.equals("Estonia")) {
                break;
            } else {
                System.out.println("Incorrect guess, please try again");
            }

        }
            System.out.println("GG you got it right!");

    }

        public void exampleCount1to10() {
            int counter = 1;

            while (counter <= 10) {
                System.out.println(counter);
                counter ++;
            }
        }

}
