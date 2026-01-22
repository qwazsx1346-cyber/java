package starcraft;

public abstract class Unit {
    protected int hp;
    protected int x;
    protected int y;

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
