package model;

public class CreditCart implements Payment {

	@Override
	public double paymentMethod(double total) {
		double fees = total * (5.0/100.0); //juros
		return total + fees;	
	}

}
