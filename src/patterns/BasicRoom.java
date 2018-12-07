package patterns;

public class BasicRoom extends MotelRoom{
	
	private static final double COST = 50;
	
	public BasicRoom() {
		description = "Basic Room";
	}
	
	@Override
	public double getCost() {
		return COST;
	}
}
