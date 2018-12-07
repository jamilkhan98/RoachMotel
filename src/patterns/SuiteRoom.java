package patterns;

public class SuiteRoom extends MotelRoom {

	private static final double COST = 100;
	
	public SuiteRoom() {
		description = "Suite Room";
	}
	
	@Override
	public double getCost() {
		return COST;
	}

}
