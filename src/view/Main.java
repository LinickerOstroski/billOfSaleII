package view;

import model.CreditCart;
import model.DebitCard;
import model.Sale;

public class Main {

	public static void main(String[] args) {	
		
		Sale sale = new Sale();
		sale.createSaleItem("at", 2);
		sale.createSaleItem("ff", 1);
		sale.createSaleItem("msa", 2);
		
		CreditCart credit = new CreditCart();
		DebitCard debit = new DebitCard();
		
		for(String item : sale.getItems()) {
			System.out.println(item);
		}
		
		//sale.addProduct("Rice", 30.0, 5);
		//sale.addProduct("Beans", 15.0, 4);
		
		//Opcional, não temos necessidade de importar model.SaleItem
		//for (SaleItem items : sale.getItems()) {
		//	System.out.println(items.toString());
		//}
		
		System.out.println(String.format("Total: %.2f", sale.getTotal(debit)));
		System.out.println(String.format("Total: %.2f", sale.getTotal(credit)));
		
	}
}