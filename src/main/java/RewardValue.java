public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE_TO_CASH = 0.0035;
    RewardValue(int miles){
        this.cashValue = convertToCash(miles);
    }

    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    private static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE_TO_CASH;
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue / CONVERSION_RATE_TO_CASH);
    }

    double getCashValue(){
        return cashValue;
    }

    int getMilesValue(){
        return convertToMiles(cashValue);
    }
}






















