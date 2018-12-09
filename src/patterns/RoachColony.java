package patterns;

import java.util.*;

public class RoachColony implements Observer {

    private String name;
    private double currentPop;
    private final int initPop;
    private double growthRate;

    public RoachColony() {
        name = "";
        initPop = 0;
        growthRate = 0;
    }

    public RoachColony(String name, int initial, double growthRate) {
        this.name = name;
        this.initPop = initial;
        this.currentPop = initial;
        this.growthRate = growthRate;
    }

    public String getName() {
        return name;
    }

    public void party(ArrayList<String> amenities) {
        System.out.print(getName() + " is throwing a party. ");
        currentPop = initPop + (initPop * growthRate);
        if (amenities.contains("Shower")) {
        	System.out.println("Good thing " + getName() + " has a shower!");
            currentPop *= 0.75;
        } 
        else 
        {
        	System.out.println("Too bad " + getName() + " did not have a shower!");
            currentPop *= 0.5;
        }
    }

    public int getInitPop() {
        return initPop;
    }

    public void update(String mname) {
        System.out.print("The " + name + " colony has received the notification from " + mname + ".\n");
    }

    public String toString() {
        return name + " " + currentPop;
    }
}

