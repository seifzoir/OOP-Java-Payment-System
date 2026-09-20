class Customer extends User {
    private String shippingAddress;

    public Customer(int userId, String username, String email, String shippingAddress) {
        super(userId, username, email);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String getUserDetails() {
        return "Customer ID: " + userId + "  Name: " + username + "  Email: " + email + "  Address: " + shippingAddress;
    }

    public void placeOrder(int productId) {
        placeOrder(productId, 0);
    }

    public void placeOrder(int productId, int quantity) {
        System.out.println("Customer " + username + " placed an order for Product ID " + productId + " (Quantity: " + quantity + ").");
    }
}