class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean validateCard(String cardNumber) {
        System.out.println("card validation for PayPal account: " + email);
        return true;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for account " + email + ".");
    }
}
