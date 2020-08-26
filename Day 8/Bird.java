
public abstract class Bird {

	int lifeTime;
	String color;
	String food;
	String localName;
	
	public abstract void sound();
	public abstract void multicolor();
	
	public void use() {
		System.out.println("Birds help in maintaining the Ecosystem and preserve the food chain");
	}
	public void eatfood() {
		if(this.food == "")
			System.out.println("eating...");
		else
			System.out.println("The Bird is Eating " + this.food);
	}
	
	public void eat() {
		System.out.println("Most of the birds eat worms and grains.");
	}

}
