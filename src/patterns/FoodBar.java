package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: To have FoodBar amenity added to Motel Room amenities
* Input: Motel Room to which amenity will be added
* Output: Motel Room to which amenity was added, the amenity, and total cost
*
*/

public class FoodBar extends AmenitiesDecorator{
    MotelRoom mr;
    
    public FoodBar(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", Food Bar";
    }
    
    public double getCost() {
        return 20 + mr.getCost();
    }

}
