package patterns;
/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: 
* Input: n/a
* Output: Description and cost
*
*/

public class Spa extends AmenitiesDecorator{
    MotelRoom mr;
    
    public Spa(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", Spa";
    }
    
    public double getCost() {
        return 20 + mr.getCost();
    }

}
