class Admin extends User {
    private String adminRole;

    public Admin(int userId, String username, String email, String adminRole) {
        super(userId, username, email);
        this.adminRole = adminRole;
    }

    @Override
    public String getUserDetails() {
        return "Admin ID: " + userId + "  Name: " + username + "  Email: " + email + "  Role: " + adminRole;
    }

    public void updateProduct(Product product, double newPrice, int newStock) {
        System.out.println("Admin " + username + " updating product: " + product.getName());
        product.setPrice(newPrice);
        product.setStock(newStock);
        System.out.println("Product updated successfully New Price: $" + product.getPrice() + ", New Stock: " + product.getStock());
    }
}