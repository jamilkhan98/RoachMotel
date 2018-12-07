package patterns;

public class DeluxeRoom extends MotelRoom {

	private static final double COST = 75;
	
	public DeluxeRoom() {
		description = "Deluxe Room";
	}
	
	@Override
	public double getCost() {
		return COST;
	}

}