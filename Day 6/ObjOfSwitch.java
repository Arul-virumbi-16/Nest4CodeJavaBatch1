public class ObjOfSwitch {
	
	public static void main(String[] args) {
		
		Switch switch1 = new Switch();
		switch1.state = 1;
		switch1.amps = 5;
		switch1.color = "white";
		switch1.explain();
		switch1.wstate(switch1.state);
		switch1.working();
		
		Switch switch2 = new Switch();
		switch2.state = 0;
		switch2.amps = 15;
		switch2.color = "Black";
		switch2.explain();
		switch2.wstate(switch2.state);
		switch2.damage();
		
		Switch switch3 = new Switch();
		switch3.state = 1;
		switch3.amps = 15;
		switch3.color = "Grey";
		switch3.purpose = "Household";
		switch3.explain();
		switch3.wstate(switch3.state);
		
		Switch switch4 = new Switch();
		switch4.amps = 5;
		switch4.color = "Sandal";
		switch4.purpose = "Multi purpose";
		switch4.explain();
		switch4.wstate(switch4.state);
		
		Switch switch5 = new Switch();
		switch5.amps = 15;
		switch5.color = "Ivory";
		switch5.purpose = "Industrial";
		switch5.explain();
		switch5.wstate(switch5.state);
		switch5.damage();
		
	}
}
