package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: The SuiteRoom creates a different MotelRoom type for the RoachMotel
* Input: n/a
* Output: getCost()
*
*/

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
