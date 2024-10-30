package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> list = new ArrayList<>();
	
	public void addProduct(String description, double price, int quantity) {
		Product product = new Product();
		product.setDescription(description);
		product.setPrice(price);
		SaleItem sale = new SaleItem();
		sale.setProduct(product);
		sale.setQuantity(quantity);
		list.add(sale);
	}
	
	public double getTotal() {
		double total = 0;
		
		for (SaleItem saleItem : list) {
			total += saleItem.getSubtotal();
		}
		
		return total;
	}
	
	public List<SaleItem> getItems(){
		return new ArrayList<>(list);
	}
}