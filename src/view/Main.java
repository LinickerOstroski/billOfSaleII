package view;

import model.Sale;
import model.SaleItem;

public class Main {

	public static void main(String[] args) {	
		
		Sale sale = new Sale();
		
		sale.addProduct("Rice", 30.0, 5);
		sale.addProduct("Beans", 15.0, 4);
		
		
		//Opcional, não temos necessidade de importar model.SaleItem
		for (SaleItem items : sale.getItems()) {
			System.out.println(items.toString());
		}
		
		System.out.println(String.format("Total: %.2f", sale.getTotal()));
		
	}
}