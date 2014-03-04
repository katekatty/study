package ru.spbau.ustuzhanina.drunkard.Objects;

import ru.spbau.ustuzhanina.drunkard.Constants;

/**
 * Created by KateKate on 02.03.14.
 */
public class Column extends Object {
    public Column() {
        super.setState(Constants.BUSY_CEIL);
        super.setActor(Constants.COLUMN_ACTOR);
        super.setSymbolToPrint(Constants.COLUMN_CEIL_SYMBOL);
        super.setPosition(Constants.COLUMN_POSITION);
    }
}
