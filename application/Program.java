package application;

import java.util.Date;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Date date = new Date();
		Product product = new Product("Notebook", 1000.00);
		ImportedProduct ip = new ImportedProduct("Tablet", 260.00, 20.00);
		UsedProduct up = new UsedProduct("Iphone", 400.00, date);
		System.out.println(product.priceTag());
		System.out.println(ip.priceTag());
		System.out.println(up.priceTag());
	}
}
