class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public void processPayment(double amount) {
        if (validateCard(this.cardNumber)) {
            System.out.println("Processing Credit Card payment of $" + amount + " successfully.");
        } else {
            System.out.println("Credit Card validation failed");
        }
    }
}
