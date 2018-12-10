package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* Purpose: abstract class to allow different Motel Room objects to be created
* Input: room number of MotelRoom, Roach Colony which will inhabit Motel Room, and amenities included in Motel Room
* Output: Motel room number, amenities included in room, and which Roach Colony is currently living in Motel Room
*
*/


import java.util.*;

public abstract class MotelRoom {
    
    protected double roomCost;
    protected RoachColony rc;
    protected ArrayList<String> amenities;
    private int roomNumber;
    String description = "Unknown Motel Room";
    
    
    public String getDescription() {
        return description;
    }
    
    public int getroomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(int Number) {
        roomNumber = Number;
    }
    
    public void setRoachColony(RoachColony RC) {
        rc = RC;
    }
    
    public RoachColony getRoachColony() {
        return rc;
    }
    
    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }
    
    public ArrayList<String> getAmenities(){
        return amenities;
    }
    
    public abstract double getCost();
        
    public String toString() {
    	String s = "Motel Room " + getroomNumber() + " || " + getDescription();
    	s += " || Roach Colony: " + rc.getName();
    	return s;
    }   
}
