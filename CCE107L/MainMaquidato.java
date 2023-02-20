import javax.swing.*;

public class MainMaquidato {
    public static void main(String[] args) {
        // Create a new BankCardMaquidato object and initialize its fields
        BankCardMaquidato bankCard = new BankCardMaquidato("1234 5678 9012 3456", "Christopher Pond", "12/26", 1000000.0);

        // Prompt the user to select an item to buy
        Object[] items = {"iPhone 14 Pro Max (₱70,990.00)", "MacBook Pro (₱92,990.00)", "AirPods Pro (₱14,990.00)", "Apple Watch (₱15,990.00)"};
        String selectedItem = (String) JOptionPane.showInputDialog(null, "Select an item to buy:", "Item Selection", JOptionPane.PLAIN_MESSAGE, null, items, items[0]);

        // Process the payment
        double price = 0.0;
        switch (selectedItem) {
            case "iPhone 14 Pro Max (₱70,990.00)":
                price = 70990.0;
                break;
            case "MacBook Pro (₱92,990.00)":
                price = 929900.0;
                break;
            case "AirPods Pro (₱14,990.00)":
                price = 14990.0;
                break;
            case "Apple Watch (₱15,990.00)":
                price = 15990.0;
                break;

        }
        boolean success = bankCard.charge(price);

        // Display the summary of card details, charge, and balance
        if (success) {
            String message = String.format("Card Number: %s\nCard Holder: %s\nExpiration Date: %s\nCharge: ₱%.2f\nBalance: ₱%.2f",
                    bankCard.getCardNumber(), bankCard.getCardHolderName(), bankCard.getExpirationDate(),
                    price, bankCard.getBalance());
            JOptionPane.showMessageDialog(null, message, "Payment Summary", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Transaction failed due to insufficient funds.", "Payment Summary", JOptionPane.ERROR_MESSAGE);
        }
    }
}
