package ru.spbau.ustuzhanina.drunkard.Objects;

import ru.spbau.ustuzhanina.drunkard.Constants;

/**
 * Created by KateKate on 02.03.14.
 */
public class Emptyobject extends Object {
    public Emptyobject() {
        super.setSymbolToPrint(Constants.FREE_CEIL_SYMBOL);
        super.setState(Constants.FREE_CEIL);
        super.setActor(Constants.NO_ACTOR);
    }
}
