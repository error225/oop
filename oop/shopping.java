// Step 1: Define the Payment Strategy interface
interface PaymentStrategy {
    void pay(double amount);
}

// Step 2: Concrete implementation for Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed through Credit Card: " + creditCardNumber);
    }
}

// Step 3: Concrete implementation for PayPal Payment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed through PayPal account: " + email);
    }
}

// Step 4: Concrete implementation for Bitcoin Payment
class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed through Bitcoin address: " + bitcoinAddress);
    }
}

// Step 5: ShoppingCart class which will use the payment strategy
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Calculate total amount of the cart and make the payment using the strategy
    public void checkout(double totalAmount) {
        paymentStrategy.pay(totalAmount);
    }
}

// Step 6: Client class to demonstrate the Strategy pattern
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Sample total amount to be paid
        double totalAmount = 250.75;

        // Client chooses to pay with Credit Card
        System.out.println("Choosing Credit Card Payment:");
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(totalAmount);

        // Client chooses to pay with PayPal
        System.out.println("\nChoosing PayPal Payment:");
        cart.setPaymentStrategy(new PayPalPayment("user@paypal.com"));
        cart.checkout(totalAmount);

        // Client chooses to pay with Bitcoin
        System.out.println("\nChoosing Bitcoin Payment:");
        cart.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F7G8H9I"));
        cart.checkout(totalAmount);
    }
}
