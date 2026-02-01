package AbstractFactory;

enum paymentGatewayType{
	RAZORPAY,PAYU,STRIPE,PAYPAL
}


// ...................payment interface...................... 

interface PaymentGatewayInterface{
	public void pay(double amount);
}

//...................invoice interface......................
interface InvoiceInterface{
	public void generateInvoice();
}

//...................regional factory interface.................
interface RegionalFactoryInterface{
	public PaymentGatewayInterface getPaymentGateway(paymentGatewayType gatewayType);
	public InvoiceInterface getInvoice();
}


//..................implementing payment gateway.................

class Razorpay implements PaymentGatewayInterface{
	@Override
	public void pay(double amount) {
		System.out.println("payment of "+amount+" done using razorpay");
	}
}

class PayU implements PaymentGatewayInterface{
	@Override
	public void pay(double amount) {
		System.out.println("payment of "+amount+" done using PayU");
	}
}

class PayPal implements PaymentGatewayInterface{
	@Override
	public void pay(double amount) {
		System.out.println("payment of "+amount+" done using paypal");
	}
}

class Stripe implements PaymentGatewayInterface{
	@Override
	public void pay(double amount) {
		System.out.println("payment of "+amount+" done using stripe");
	}
}


//...............implementing invoice interface.................

class IndiaInvoice implements InvoiceInterface{
	public void generateInvoice() {
		System.out.println("india invoice created");
	}
}

class USAInvoice implements InvoiceInterface{
	public void generateInvoice() {
		System.out.println("USA invoice created");
	}
}




//.................implementing regional factory.............


class IndiaFactory implements RegionalFactoryInterface{
	public PaymentGatewayInterface getPaymentGateway(paymentGatewayType gatewayType) {
		switch (gatewayType) {
        case RAZORPAY:
            return new Razorpay();
        case PAYU:
            return new PayU();
        default:
            throw new IllegalArgumentException("Gateway not supported in India");
    }
	}
	public InvoiceInterface getInvoice() {
		return new IndiaInvoice();
	}
}

class USAFactory implements RegionalFactoryInterface{
	public PaymentGatewayInterface getPaymentGateway(paymentGatewayType gatewayType) {
		switch (gatewayType) {
        case PAYPAL:
            return new PayPal();
        case STRIPE:
            return new Stripe();
        default:
            throw new IllegalArgumentException("Gateway not supported in USA");
		}
    }
	public InvoiceInterface getInvoice() {
		return new USAInvoice();
	}
}

class Checkout{
	private RegionalFactoryInterface factory;
	private InvoiceInterface invoice;
	private paymentGatewayType gatewayType;
	
	
	public Checkout(RegionalFactoryInterface factory,paymentGatewayType gatewayType) {
		this.factory = factory;
		this.gatewayType = gatewayType;
		this.invoice = factory.getInvoice();
	}
	
	public void completePayment(double amount) {
			factory.getPaymentGateway(gatewayType).pay(amount);
			invoice.generateInvoice();
	}
	
	
	
	
	
}

public class PayementServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checkout chk1 = new Checkout(new IndiaFactory(),paymentGatewayType.RAZORPAY);
		chk1.completePayment(500);
		
		System.out.println("..............................");
		
		Checkout chk2 = new Checkout(new IndiaFactory(),paymentGatewayType.PAYU);
		chk2.completePayment(600);
		
		System.out.println("..............................");
		
		Checkout chk3 = new Checkout(new USAFactory(),paymentGatewayType.PAYPAL);
		chk3.completePayment(700);
		
		System.out.println("..............................");
		
		Checkout chk4 = new Checkout(new USAFactory(),paymentGatewayType.STRIPE);
		chk4.completePayment(800);
		
		System.out.println("..............................");
		

	}

}
