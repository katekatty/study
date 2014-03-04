package ru.spbau.ustuzhanina.drunkard.Objects;

import ru.spbau.ustuzhanina.drunkard.GameZone.Coordinates;
import ru.spbau.ustuzhanina.drunkard.GameZone.Field;

/**
 * Created by KateKate on 02.03.14.
 */
public class Object {
    private boolean state;
    private String symbolToPrint;
    private int actor;
    private Field field;
    private Coordinates position;


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getSymbolToPrint() {
        return symbolToPrint;
    }

    public void setSymbolToPrint(String symbolToPrint) {
        this.symbolToPrint = symbolToPrint;
    }

    public int getActor() {
        return actor;
    }

    public void setActor(int actor) {
        this.actor = actor;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }
}
