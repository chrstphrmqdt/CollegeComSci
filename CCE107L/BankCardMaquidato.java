

public class BankCardMaquidato {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private double limit;
    private double balance;

    public BankCardMaquidato(String cardNumber, String cardHolderName, String expirationDate, double limit) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.limit = limit;
        this.balance = limit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

