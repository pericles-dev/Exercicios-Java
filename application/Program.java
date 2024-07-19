package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			sc.nextLine();
			char type = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'c') {
				Product product = new Product(name, price);
				products.add(product);
			} else if (type == 'u') {
				
				Date date = new Date();
				
				Product product = new UsedProduct(name, price, date);
				products.add(product);
			} else if (type == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				products.add(product);
			} else {
				System.out.println("This type of product does not exist");
				i--;
			}
		}
		
		System.out.println("Price tags: ");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
	}
}
