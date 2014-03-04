package ru.spbau.ustuzhanina.drunkard.GameZone;

/**
 * Created by KateKate on 01.03.14.
 */
public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinates position) {
        if ((position.getY() == y) && (position.getX() == x)) {
            return true;
        } else {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
