package technology;

public class SmartPhone extends  Computer{
    private int numberOfSelfies;

    public SmartPhone(int ram,int storage, boolean hasKeyboard,int numberOfSelfies){
        super(ram,storage,hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }

    public  void takeSelfies(){
        this.numberOfSelfies = numberOfSelfies +1;
    }

    public int getNumberOfSelfies(){
        return this.numberOfSelfies;

    }
}
