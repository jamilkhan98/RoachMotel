package patterns;
/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: 
* Input: n/a
* Output: returns description and cost
*
*/

public class RefillBar extends AmenitiesDecorator{
    MotelRoom mr;
    
    public RefillBar(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", Refill Bar";
    }
    
    public double getCost() {
        return 5 + mr.getCost();
    }

}
