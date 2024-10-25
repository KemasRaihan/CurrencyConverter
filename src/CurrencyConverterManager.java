import java.util.Scanner;

public class CurrencyConverterManager {
    public static void Menu(){
        String option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------");
            System.out.println("Currency Converter");
            System.out.println("-------------------");
            System.out.println("1. American Dollars To British Sterling (Pounds)");
            System.out.println("2. American Dollars To Euros");
            System.out.println("3. British Sterling (Pounds) To American Dollars");
            System.out.println("4. British Sterling (Pounds) To Euros");
            System.out.println("5. Euros To American Dollars");
            System.out.println("6. Euros To British Sterling (Pounds)");
            System.out.println("0. To Quit");
            System.out.print("Select an option: ");

            CurrencyConverter converter = null;

            option = input.next();

            switch (option) {
                case "1":
                    convertDollarsToSterling(input, converter = new DollarConverter());
                    break;
                case "2":
                    convertDollarsToEuros(input, converter = new DollarConverter());
                    break;
                case "3":
                    convertSterlingToDollars(input, converter = new SterlingConverter());
                    break;
                case "4":
                    convertSterlingToEuros(input, converter = new SterlingConverter());
                    break;
                case "5":
                    convertEurosToDollars(input, converter = new EurosConverter());
                    break;
                case "6":
                    convertEurosToSterling(input, converter = new EurosConverter());
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
            System.out.println();
        }while(!option.equals("0"));

    }

    public static void convertDollarsToSterling(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in dollars): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToSterling(amount);
        System.out.println("$" + amount + " is £" + newAmount);

    }

    public static void convertDollarsToEuros(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in dollars): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToEuros(amount);
        System.out.println("$" + amount + " is €" + newAmount);

    }
    public static void convertSterlingToDollars(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in sterling): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToDollars(amount);
        System.out.println("£" + amount + " is $" + newAmount);

    }

    public static void convertSterlingToEuros(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in dollars): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToEuros(amount);
        System.out.println("$" + amount + " is €" + newAmount);

    }

    public static void convertEurosToDollars(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in euros): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToDollars(amount);
        System.out.println("€" + amount + " is $" + newAmount);

    }

    public static void convertEurosToSterling(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in euros): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToSterling(amount);
        System.out.println("€" + amount + " is £" + newAmount);

    }
}
