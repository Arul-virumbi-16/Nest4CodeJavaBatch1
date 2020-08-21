public class Switch {
	
	int state;
	int amps;
	String color;
	String purpose;
	String appliance;
	
	public void wstate(int a) {
		if(a == 0) System.out.println("The Switch is in the OFF state");
		if(a > 0) System.out.println("The Switch is in the ON state");
	}
	public void working() {
		System.out.println("The Switch is in the working condition.");
	}
	public void damage() {
		System.out.println("The switch is damaged , You have to replace it.");
	}
	
	public void use() {
		System.out.println("The switch is used for the controlling of " + appliance);
	}
	public void explain() {
		System.out.println("The Switch is a "+ amps + " Ampere " + color + " Colour Switch.");
	}
}
