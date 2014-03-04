package ru.spbau.ustuzhanina.drunkard.GameZone;

import ru.spbau.ustuzhanina.drunkard.Constants;
import ru.spbau.ustuzhanina.drunkard.Objects.Column;
import ru.spbau.ustuzhanina.drunkard.Objects.Object;

/**
 * Created by KateKate on 01.03.14.
 */
public class Field {
    private Ceil[][] allCeils;

    public Field() {
        allCeils = new Ceil[Constants.FIELD_WIDTH][Constants.FIELD_HEIGHT];
        for (int i = 0; i < Constants.FIELD_WIDTH; i++) {
            for (int j = 0; j < Constants.FIELD_HEIGHT; j++) {
                allCeils[i][j] = new Ceil();
            }
        }
        //to do оптимизировать константы для большого числа статических объектов
        setObject(Constants.COLUMN_POSITION, new Column());
    }

    public void printFieldState() {
        System.out.println("                  " + Constants.PUB_CEIL_SYMBOL);
        for (int i = 0; i < Constants.FIELD_WIDTH; i++) {
            for (int j = 0; j < Constants.FIELD_HEIGHT; j++) {
                System.out.print(allCeils[j][i].getObject().getSymbolToPrint() + " ");
            }
            System.out.println();
        }
    }

    public void setObject(Coordinates position, Object object) {
        allCeils[position.getX()][position.getY()].setObject(object);
    }

    public void delObject(Coordinates position, Object object) {
        allCeils[position.getX()][position.getY()].delObject();
    }


    public Ceil getCeil(Coordinates position) {
        return allCeils[position.getX()][position.getY()];
    }

    public boolean isCeilAvailable(Coordinates position) {
        if (!isWallBorder(position) && !allCeils[position.getX()][position.getY()].getObject().isState()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWallBorder(Coordinates position) {
        if ((position.getX() < 0) || (position.getX() >= Constants.FIELD_WIDTH)
                || (position.getY() < 0) || (position.getY() >= Constants.FIELD_HEIGHT)) {
            return true;
        } else {
            return false;
        }
    }
}
