package CSLab;

public class TestMaterial {
	public static void main(String [] args) {
		Material bat = new Material();
		bat.name = "SS Bat";
		bat.company = "SS";
		bat.brand = "Hard Ball";
		bat.catagory = Material.catagoryList[1];
		bat.price = 5500;
		bat.warranty = 3;
		bat.quality = "GOOD";
		bat.introduceProduct(bat);
		
		
		
		
		
	}

}
