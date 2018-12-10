package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: Amenity for a RoachMotel that has the RoachColony's population only decrease by 0.75
* Input: Shower()
* Output: getCost()
*
*/

public class Shower extends AmenitiesDecorator{
    MotelRoom mr;
    
    public Shower(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", Shower";
    }
    
    public double getCost() {
        return 50 + mr.getCost();
    }

}
