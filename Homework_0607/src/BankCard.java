public class BankCard {
    private final String cardData;
    private final String currency;
    private final String status;

    public String getCardData() {
        return cardData;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }

    public BankCard(String cardData, String currency, String status) {
        this.cardData = cardData;
        this.currency = currency;
        this.status = status;
    }
}
