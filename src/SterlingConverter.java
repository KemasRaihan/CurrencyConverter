public class SterlingConverter implements CurrencyConverter {
    public SterlingConverter(){

    }

    @Override
    public float convertToDollars(float amount){
        return amount * 1.28f;

    }

    @Override
    public float convertToSterling(float amount){
        return amount;
    }

    @Override
    public float convertToEuros(float amount){
        return amount * 1.16f;
    }

}
