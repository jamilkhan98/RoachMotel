package patterns;

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
