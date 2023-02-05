package snake_and_ladder;
public class Snake {
    private int head;
    private int tail;

    Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }
}
