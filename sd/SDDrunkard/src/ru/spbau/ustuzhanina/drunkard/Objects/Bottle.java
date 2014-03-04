package ru.spbau.ustuzhanina.drunkard.Objects;

import ru.spbau.ustuzhanina.drunkard.Constants;
import ru.spbau.ustuzhanina.drunkard.GameZone.Coordinates;

/**
 * Created by KateKate on 02.03.14.
 */
public class Bottle extends Object {
    public Bottle(Coordinates position) {
        super.setState(Constants.BUSY_CEIL);
        super.setActor(Constants.BOTTLE_ACTOR);
        super.setSymbolToPrint(Constants.BOTTLE_CEIL_SYMBOL);
        super.setPosition(position);
    }

}
