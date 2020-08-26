
public class Ostrich extends Bird{

	public void sound() {
		System.out.println("Ostrich produce many sounds like chirp,barh,hiss,low hum");

	}

	public void multicolor() {
		System.out.println("Ostrich has white, black and light brown colors in its body");
	}

	@Override
	public void eat() {
		System.out.println("Ostrich eat plants, roots and seeds.");
	}
	
	public void eat(String e) {
		System.out.println("Ostrich eat " + e);
	}
}
