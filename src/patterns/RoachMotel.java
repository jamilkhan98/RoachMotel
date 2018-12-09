package patterns;

import java.util.*;

/**
 * Brandon Anthony Jamil Brandon December 10, 2018 Purpose: Singleton Design
 * Pattern implemented for the RoachMotel. Input: setCapacity(), setName(),
 * setVacancy() Output: getCapcity(), getName(), getVacancy(), toString()
 *
 */

public class RoachMotel implements Subject{

    private static RoachMotel unique = new RoachMotel();
    private RoachMotel() {}

    private final int capacity = 2;
    private int currentCapacity = capacity;
    private String name;
    private ArrayList<Integer> vacantRooms = new ArrayList<>();
    private ArrayList<Integer> occupiedRooms = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

    
    public static RoachMotel getInstance() {
        return unique;
    }

    public int getCapacity() {
        return currentCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createRooms() {
        for (int i = 0; i < capacity; i++) {
            vacantRooms.add(100+i);
        }
    }

    public ArrayList<Integer> getRooms() {
        return vacantRooms;
    }

    public MotelRoom checkIn(RoachColony rc, String roomType, ArrayList<String> amenities) {
        //MIMI APPROVED; NO MARK DOWNS ALLOWED HERE
        MotelRoom mr;
        if (vacantRooms.size() >= 1) {
            if (roomType.equals("Basic")) {
                mr = new BasicRoom();
            } else if (roomType.equals("Deluxe")) {
                mr = new DeluxeRoom();
            } else {
                mr = new SuiteRoom();
            }

            if (amenities.contains("FoodBar")) {
                mr = new FoodBar(mr);
            }
            if (amenities.contains("Shower")) {
                mr = new Shower(mr);
            }
            if (amenities.contains("Spa")) {
                mr = new Spa(mr);
            }
            if (amenities.contains("RefillBar")) {
                mr = new RefillBar(mr);
            }
            occupiedRooms.add(vacantRooms.get(0));
            mr.setRoachColony(rc);
            mr.setRoomNumber(vacantRooms.remove(0));
            currentCapacity--;
            System.out.println(rc.getName() + " has checked into room " + mr.getroomNumber());
            return mr;
        }
        else {
            addObserver(rc);
            return null;
        }
    }

    public Double checkOut(MotelRoom mr, int days) {
        vacantRooms.add(mr.getroomNumber());
        occupiedRooms.remove((Integer)mr.getroomNumber());
        currentCapacity++;
        System.out.println((mr.getRoachColony()).getName() + " has checked out of room " + mr.getroomNumber() + " after " + days + " days.");
        vacancyChanged();
        return mr.getCost() * days;
    }
    
    public void addObserver(Observer o) {
        if(vacantRooms.size() < 1 && !observers.contains(o))
        observers.add(o);
        System.out.println("Observers: " + observers);
    }

    public void removeObserver(Observer o) {
        if(observers.contains(o))
        observers.remove(o);
    }
    
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(getInstance().getName());
//            removeObserver(observer);
            }
        observers.clear();
    }
    
    public void vacancyChanged() {
        notifyObservers();
    }
    
    public String toString() {
        return "Motel Name: " + name + " || Initial Capacity: " + capacity + " || Current Capacity: " + getCapacity();
    }
}

