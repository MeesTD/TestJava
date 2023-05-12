
public class Application {

	public static void main(String[] args) {
		
		// Maak een animal en 3 animals op basis van children classes.
		
		Animal a = new Cat();
		a.setLegs(15);
		a.setName("Jantien Vijftien");
		a.setType("Veel poot");
		a.makeSound();
		
		Cat poes = new Cat();
		poes.setName("Miauw");
		poes.setLegs(4);
		poes.setType("Kat");
		
		Horse mindy = new Horse();
		mindy.setLegs(4);
		mindy.setName("Mindy");
		mindy.setType("Paard");
		
		Bird fladder = new Bird();
		fladder.setLegs(2);
		fladder.setName("Tweety");
		fladder.setType("Vogel");
		
	}

}
