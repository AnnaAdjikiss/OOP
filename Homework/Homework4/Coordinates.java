package Homework.Homework4;

public class Coordinates {
    public int x;
    public int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("X: %d Y: %d", x, y);
    }
}
