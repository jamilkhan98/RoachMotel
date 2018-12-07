package patterns;

public class RefillBar extends AmenitiesDecorator{
    MotelRoom mr;
    
    public RefillBar(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", RefillBar";
    }
    
    public double getCost() {
        return 5 + mr.getCost();
    }

}