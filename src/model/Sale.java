package model;

import java.util.ArrayList;
import java.util.List;

public class Sale{
	private List<SaleItem> list = new ArrayList<>();
	
	public void createSaleItem(String code, int quantity) {
		SaleItem item = new SaleItem();
		item.createProduct(code, quantity);
		list.add(item);
	}
	
	public double getTotal(Payment payment) {
		double total = 0;
		
		for (SaleItem saleItem : list) {
			total += saleItem.getSubtotal();
		}
		
		return payment.paymentMethod(total);
	}
	
	
	public List<String> getItems(){
		List<String> itemsStr = new ArrayList<>();
		for (SaleItem saleItem : list) {

			itemsStr.add(saleItem.toString());
		}
		return itemsStr;
	}

}