package patterns;

/**
*
*@author Brandon Nhem, Jamil Khan, Anthony Pham, Brandon Walker
*Purpose: Interface which allows Decorator Pattern to be used on Motel Room objects
*Inputs: none required
*Outputs: none required
*/

public abstract class AmenitiesDecorator extends MotelRoom{
    public abstract String getDescription();
}
