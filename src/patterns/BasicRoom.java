package patterns;

/**
*
*@author Brandon Nhem, Jamil Khan, Anthony Pham, Brandon Walker
*Purpose: To have a Basic Motel Room to hold Roach Colonies
*Input: none required
*Outputs: description of room, and cost of room
*/

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
