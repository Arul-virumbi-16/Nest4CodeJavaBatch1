
public class ConstructBirds {
	public static void main(String[] args) {
		Bird penguin1 = new Penguin();
		penguin1.eat();
		
		Parrot parrot1 = new Parrot();
		parrot1.eat();
		parrot1.eat("seeds");
	}
}
