public class Account {

    private float amount;
    private String name;

    public Account (float amount) {
        this.amount = amount;
        this.name = "Siraj";
    }

    public void deposit(float amount) {
        this.amount+=amount;
    }
    public String getName() {
        return this.name;
    }
    public float getAmount() {
        return this.amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}
