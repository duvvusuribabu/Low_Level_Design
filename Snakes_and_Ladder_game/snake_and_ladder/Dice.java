package snake_and_ladder;
import java.util.*;
public class Dice {
    private int size;
   public Dice(int size) {
        this.size = size;
    }
   public Dice() {
        this(6);
    }
    public int getSizeDice() {
        return size;
    }
    public int getRollDice() {
    
            return (int) ((Math.random() * (6*size - 1*(size-1)) + 1));
       
    }
}
