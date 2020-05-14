package CSLab;

public class Material {
	String name;
	static String[] catagoryList = { "Electronics", "Sports", "Household", "Books", "Textiles" };
	String catagory = Material.catagoryList[0];
	String company = "JTAG";
	String brand = "Unavailable";
	double price = 99;;
	static String[] qualitylist = { "Excellent", "Good", "Average", "Bad" };
	String quality = "GOOD";
	int warranty = 3;

	void introduceProduct(Material object) {
		System.out.println("This is " + object.name + " of " + object.company + " company in a catagory of " + object.catagory);
		System.out.println("Its price is RS " + object.price + " and it is in " + object.quality + " condition."
				+ " It is having warranty of " + object.warranty+" years");

	}

}
