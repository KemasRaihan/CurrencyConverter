public class EurosConverter implements CurrencyConverter {
    public EurosConverter(){
    }

    @Override
    public float convertToDollars(float amount){
        return amount * 1.09f;
    }

    @Override
    public float convertToSterling(float amount){
        return amount * 0.86f;
    }

    @Override
    public float convertToEuros(float amount){
        return amount;
    }

}
