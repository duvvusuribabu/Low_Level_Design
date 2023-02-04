 public class Dice {
    private int size;
    Dice(int size){
     this.size = size;
    }
    Dice(){
        this(6);
    }
    public int getSizeDice(){
        return size;
    }
    public int getRollDice( ){
        return (int)Math.random() * ((6*size - 1*(size-1))+1);
    }
}
