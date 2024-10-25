public class DollarConverter implements CurrencyConverter {

    public DollarConverter(){

    }

    @Override
    public float convertToDollars(float amount){
        return amount;

    }

    @Override
    public float convertToSterling(float amount){
        return amount * 0.78f;
    }

    @Override
    public float convertToEuros(float amount){
        return amount * 0.92f;
    }



}
