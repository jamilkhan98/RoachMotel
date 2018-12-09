package patterns;

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
        return "Motel Room " + getroomNumber() + ": " + getDescription();
    }   
}