
public class Parrot extends Bird implements FlyBehaviour{

	public void fly() {
		System.out.println("Parrot can fly.");
	}

	public void sound() {
		System.out.println("Parrot can talk ,screech and squawk");

	}

	public void multicolor() {
		System.out.println("Parrot has only white and black colors in its body");
	}
	
	@Override
	public void eat() {
		System.out.println("Parrots eat nuts , fruits , seeds and insects");
	}
	
	public void eat(String e) {
		System.out.println("Parrots eat " + e);
	}
}
