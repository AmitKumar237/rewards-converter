public class RewardValue {
    double miles;
    double cash;
    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * 0.0035;
    }

    RewardValue(double cash){
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    double getCashValue(){
        return cash;
    }

    double getMilesValue(){
        return miles;
    }
}






















