package CSLab;

import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class LabTask {
	private static String categoryName;
	private static String name;
	private static String type;
	private static String brand;
	private static String price;
	private static String path;
	private static String warranty;
	private static qualities quality;

	enum qualities {
		Low, Medium, High;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category of the product:");
		LabTask.setCategoryName(sc.next());
		System.out.println("Enter name of the product:");
		LabTask.setName(sc.next());
		System.out.println("Enter type of the product:");
		LabTask.setType(sc.next());
		System.out.println("Enter brand of the product:");
		LabTask.setBrand(sc.next());
		System.out.println("Enter price of the product:");
		LabTask.setPrice(sc.next());
		System.out.println("Enter path of the product:");
		LabTask.setPath(sc.next());

		System.out.println("Enter quality 0 for low, 1 for medium and 2 for high:");
		switch (sc.nextInt()) {
		case 0:
			LabTask.setQuality(qualities.Low);
			break;
		case 1:
			LabTask.setQuality(qualities.Medium);
			break;
		case 2:
			LabTask.setQuality(qualities.High);
			break;
		default:
			System.out.println("Enter correct value.");
		}
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");

		LabTask.setWarranty(sdf.format(date));
		System.out.println("Category  " + getCategoryName() + ".\nName of the product  " + getName()
				+ ".\nType of the product  " + getType() + ".\nBrand  " + getBrand() + ".\nPrice  " + getPrice()
				+ ".\nPath of the file " + getPath() + ".\nWarranty  " + getWarranty() + ".\nQuality  " + getQuality());
	}

// return the category of the product
	public static String getCategoryName() {
		return categoryName;
	}

// get the category of the product from user 
	public static void setCategoryName(String categoryName) {
		LabTask.categoryName = categoryName;
	}

// return the name of the product
	public static String getName() {
		return name;
	}

// get the name of the product from user
	public static void setName(String name) {
		LabTask.name = name;
	}

// return the type of the product
	public static String getType() {
		return type;
	}

// get the type of the product from user
	public static void setType(String type) {
		LabTask.type = type;
	}

// return the brand of the product
	public static String getBrand() {
		return brand;
	}

// get the brand name of the product from user
	public static void setBrand(String brand) {
		LabTask.brand = brand;
	}

// return the price of the product
	public static String getPrice() {
		return price;
	}

// get the price of the product from user
	public static void setPrice(String price) {
		LabTask.price = price;
	}

// return the path of the file of the product
	public static String getPath() {
		return path;
	}

// get the path of the file of the product from user
	public static void setPath(String path) {
		LabTask.path = path;
	}

// return the quality of the product
	public static qualities getQuality() {
		return quality;
	}

// get the quality of the product from user
	public static void setQuality(qualities quality) {
		LabTask.quality = quality;
	}

// return the warranty of the product
	public static String getWarranty() {
		return warranty;
	}

// get the warranty of the product from user
	public static void setWarranty(String warranty) {
		LabTask.warranty = warranty;
	}

}
