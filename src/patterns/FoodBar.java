package patterns;

public class FoodBar extends AmenitiesDecorator{
    MotelRoom mr;
    
    public FoodBar(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", FoodBar";
    }
    
    public double getCost() {
        return 20 + mr.getCost();
    }

}
