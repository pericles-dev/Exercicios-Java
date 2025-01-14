package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String manufactureDate) throws ParseException {
		super(name, price);
		this.manufactureDate = sdf.parse(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) throws ParseException {
		this.manufactureDate = sdf.parse(manufactureDate);
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date %s)", getName(), getPrice(), sdf.format(manufactureDate));
	}
	
	
}
