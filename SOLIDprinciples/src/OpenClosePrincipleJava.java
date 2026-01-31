
interface TaxCalculator{
	public double calculateTax(int amount);
}

class IndiaTaxCalculator implements TaxCalculator{
	@Override
	public double calculateTax(int amount) {
		return amount * 0.18;
	}
}

class USATaxCalculator implements TaxCalculator{
	@Override
	public double calculateTax(int amount) {
		return amount * 0.24;
	}
}


class ChinaTaxCalculator implements TaxCalculator{
	@Override
	public double calculateTax(int amount) {
		return amount * 0.10;
	}
}


class Invoice {
	private int amount;
	TaxCalculator calculator;
	
	public Invoice(int amount, TaxCalculator calculator) {
		super();
		this.amount = amount;
		this.calculator = calculator;
	}
	
	
	public double getInvoice() {
		return amount + calculator.calculateTax(amount);
	}
}



public class OpenClosePrincipleJava {

	public static void main(String[] args) {
		
		IndiaTaxCalculator indCalc = new IndiaTaxCalculator();
		Invoice indInvoice = new Invoice(500,indCalc);
		System.out.println("Total Amount After Tax in India : "+indInvoice.getInvoice());
		
		USATaxCalculator usaCalc = new USATaxCalculator();
		Invoice usaInvoice = new Invoice(500,usaCalc);
		System.out.println("Total Amount After Tax in USA : "+usaInvoice.getInvoice());
		
		ChinaTaxCalculator chinaCalc = new ChinaTaxCalculator();
		Invoice chinaInvoice = new Invoice(500,chinaCalc);
		System.out.println("Total Amount After Tax in China : "+chinaInvoice.getInvoice());

	}

}
