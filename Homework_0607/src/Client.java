public class Client {
    private final String name;
    private final BankCard card;
    private final double balance;

    public Client(String name, BankCard card, double balance) {
        this.name = name;
        this.card = card;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public BankCard getCard() {
        return card;
    }

    public double getBalance() {
        return balance;
    }
}
