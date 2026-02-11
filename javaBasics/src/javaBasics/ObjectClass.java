package javaBasics;


interface PayemntInterface{
	public void doPayment(double amount);
}

class Razorpay implements PayemntInterface{
	@Override
	public void doPayment(double amount) {
		System.out.println("payment done using razorpay :"+amount);
	}
}


class Paypal implements PayemntInterface{
	@Override
	public void doPayment(double amount) {
		System.out.println("payment done using paypal :"+amount);
	}
}


class CheckOut{
	private PayemntInterface obj ;
	public void pay(PayemntInterface paymentGateway , double amount ) {
		this.obj = paymentGateway;
		obj.doPayment(amount);
	}
}



public class ObjectClass {

	public static void main(String[] args) {
		CheckOut obj = new CheckOut();
		obj.pay(new Paypal(), 500);
	}

}
