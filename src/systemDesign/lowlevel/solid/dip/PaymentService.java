package systemDesign.lowlevel.solid.dip;

public interface PaymentService {
    void paymentService(double amount);
}

class PaypalService implements PaymentService{
    @Override
    public void paymentService(double amount) {
        System.out.println("Paypal payment service : "+ amount);
    }
}

class StripeService implements PaymentService{
    @Override
    public void paymentService(double amount) {
        System.out.println("Stripe payment service : "+ amount);
    }
}


class PaymentProcessor {
    private PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(double amount) {
        paymentService.paymentService(amount);
    }
}

class DIPSolutionExample {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new StripeService());
        paymentProcessor.processPayment(100);

        PaymentProcessor paymentProcessor1 = new PaymentProcessor(new PaypalService());
        paymentProcessor1.processPayment(200);
    }
}