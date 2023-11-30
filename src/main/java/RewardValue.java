public class RewardValue {
    double cashValue;
    int milesValue;


    public RewardValue(double inputValue) {
        this.cashValue = inputValue;
        this.milesValue = (int)(inputValue/0.0035);
    }
    public RewardValue(int inputValue) {
        this.milesValue = inputValue;
        this.cashValue = (double)(inputValue*0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
