public class App {

	// public static final int DOG = 0;
	// public static final int CAT = 1;
	// public static final int MOUSE = 2;

	public static void main(String[] args) {

		// int animal = CAT;
		// switch(animal){
		// case DOG:
		// System.out.println("Dog");
		// break;
		// case CAT:
		// System.out.println("Cat");
		// break;

		// }

		Animal animal = Animal.CAT;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
		
		System.out.println("Enum name as a string: "+Animal.CAT.name());
		System.out.println(Animal.CAT);
		System.out.println(Animal.CAT.getClass());
		System.out.println(Animal.CAT instanceof Enum);
		System.out.println(Animal.CAT.getName());
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
		
		System.out.println("");
		
		System.out.println("Enum name as a string: "+Animal.DOG.name());
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.DOG.getName());
		Animal animal3 = Animal.valueOf("DOG");
		System.out.println(animal3);
		
		System.out.println("");
		
		System.out.println("Enum name as a string: "+Animal.MOUSE.name());
		System.out.println(Animal.MOUSE);
		System.out.println(Animal.MOUSE.getClass());
		System.out.println(Animal.MOUSE instanceof Enum);
		System.out.println(Animal.MOUSE.getName());
		Animal animal4 = Animal.valueOf("MOUSE");
		System.out.println(animal4);

	}

}
