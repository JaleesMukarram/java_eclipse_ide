
public class TestPolymorphism {

	public static void main(String[] args) {

		Animal[] array = new Animal[10];
		for (int i = 0; i < array.length; i++) {
			if (i < 3)
				array[i] = new Animal();
			else if (i < 5)
				array[i] = new Fish();
			else if (i < 7)
				array[i] = new Mammels();
			else
				array[i] = new Birds();
		}

		for (Animal a : array) {
			System.out.println(a instanceof Mammels);
		}
	}

}
