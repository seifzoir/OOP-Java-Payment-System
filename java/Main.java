public class Main {
    public static void main(String[] args) {
        Product laptop = new Product(101, "Laptop", 1000, 10);
        System.out.println("Product: " + laptop.getName() + "  Price: $" + laptop.getPrice() + "  Stock: " + laptop.getStock());

        laptop.setPrice(-50);

        User customer = new Customer(1, "ahmed223", "ahmed", "123ed");
        User admin = new Admin(2, "admin", "a@gmaol.com", "Admin");

        System.out.println(customer.getUserDetails());
        System.out.println(admin.getUserDetails());

        Customer castedCustomer = (Customer) customer;
        castedCustomer.placeOrder(101);
        castedCustomer.placeOrder(101, 3);

        Admin castedAdmin = (Admin) admin;
        castedAdmin.updateProduct(laptop, 900, 15);

        Payment creditCard = new CreditCardPayment("1234567812345678");
        Payment payPal = new PayPalPayment("seif@gmail.com");

        creditCard.processPayment(900);
        payPal.processPayment(300);
    }
}
