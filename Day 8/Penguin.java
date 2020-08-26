
public class Penguin extends Bird implements SwimBehaviour{

	public void Swim() {
		System.out.println("Penguin can Swim.");
	}

	public void sound() {
		System.out.println("Penguin produce a sound like squawking");

	}

	public void multicolor() {
		System.out.println("Penguin has only white and black colors in its body");
	}

	@Override
	public void eat() {
		System.out.println("Penguins eat krill , squid and fish.");
	}
	
	public void eat(String e) {
		System.out.println("Penguins eat " + e);
	}
}
