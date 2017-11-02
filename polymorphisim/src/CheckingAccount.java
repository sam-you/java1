public class CheckingAccount extends Account {
    public CheckingAccount(float value) {
        super(value);
    }
    public void withdraw (float cash) {
        float amount = super.getAmount();
        amount-=cash;
        super.setAmount(amount);
    }
}
