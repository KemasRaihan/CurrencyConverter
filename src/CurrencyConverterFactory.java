import java.util.Scanner;

public class CurrencyConverterFactory {
    public static float convert(String converterType, float amount){

        CurrencyConverter converter = null;

        float newAmount = -1;

        switch (converterType) {
            case "Dollars To Sterling":
                newAmount = convertDollarsToSterling(amount, converter = new DollarConverter());
                break;
            case "Dollars To Euros":
                newAmount = convertDollarsToEuros(amount, converter = new DollarConverter());
                break;
            case "Sterling To Dollars":
                newAmount = convertSterlingToDollars(amount, converter = new SterlingConverter());
                break;
            case "Sterling To Euros":
                newAmount = convertSterlingToEuros(amount, converter = new SterlingConverter());
                break;
            case "Euros To Dollars":
                newAmount = convertEurosToDollars(amount, converter = new EurosConverter());
                break;
            case "Euros To Sterling":
                newAmount = convertEurosToSterling(amount, converter = new EurosConverter());
                break;
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
        return newAmount;

    }

    // choice 1
    public static float convertDollarsToSterling(float amount, CurrencyConverter converter){
        return converter.convertToSterling(amount);
    }

    // choice 2
    public static float convertDollarsToEuros(float amount, CurrencyConverter converter){
        return converter.convertToEuros(amount);
    }

    // choice 3
    public static float convertSterlingToDollars(float amount, CurrencyConverter converter){
        return converter.convertToDollars(amount);

    }

    // choice 4
    public static float convertSterlingToEuros(float amount, CurrencyConverter converter){
        return converter.convertToDollars(amount);

    }

    // choice 5
    public static float convertEurosToDollars(float amount, CurrencyConverter converter){
        return converter.convertToDollars(amount);

    }

    // choice 6
    public static float convertEurosToSterling(float amount, CurrencyConverter converter){
        return converter.convertToSterling(amount);

    }
}
