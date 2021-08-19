package technology;

public class Laptop extends Computer {
    private  double weight;

    public double getWeight() {
        return weight;
    }

    public Laptop(int ram, int storage, boolean hasKeyBoard, double weight){
        super(ram, storage, hasKeyBoard);
        this.weight = weight;
    }

    public boolean isHeavy(){
        if(weight > 5.0){
            return true;
        }else {
            return false;
        }
    }
}
