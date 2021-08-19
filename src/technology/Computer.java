package technology;

public class Computer extends AbstractEntity{
    //Parent class

    private int ram;
    private int storage;
    private boolean hasKeyboard;

  public Computer(int ram, int storage, boolean hasKeyboard){
      super();
      this.ram = ram;
      this.storage = storage;
      this.hasKeyboard = hasKeyboard;
  }
  public void setRam(int n){
      this.ram = ram + n;
    }
    public int getRam(){
        return  ram;

    }
    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

   public void increaseStorage(int x){
      this.storage = storage + x;
   }
   public int getStorage(){
      return storage;
   }


}
