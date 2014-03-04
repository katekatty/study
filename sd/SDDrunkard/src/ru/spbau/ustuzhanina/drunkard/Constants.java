package ru.spbau.ustuzhanina.drunkard;

import ru.spbau.ustuzhanina.drunkard.GameZone.Coordinates;

/**
 * Created by KateKate on 02.03.14.
 */
public class Constants {
    public final static int BOTTLE_ACTOR = 2;
    public final static int COLUMN_ACTOR = 3;
    public final static int DRUNKARD_ACTOR = 1;
    public final static int NO_ACTOR = 0;

    public final static String FREE_CEIL_SYMBOL = ".";
    public final static String COLUMN_CEIL_SYMBOL = "C";

    public final static String DRUNKARD_CEIL_SYMBOL = "D";
    public final static String DRUNKARD_SLEEP_CEIL_SYMBOL = "Z";
    public final static String DRUNKARD_LAY_CEIL_SYMBOL = "&";

    public final static String PUB_CEIL_SYMBOL = "T";
    public final static String BOTTLE_CEIL_SYMBOL = "B";


    public final static boolean FREE_CEIL = false;
    public final static boolean BUSY_CEIL = true;

    public final static int FIELD_WIDTH = 15;
    public final static int FIELD_HEIGHT = 15;

    public final static Coordinates COLUMN_POSITION = new Coordinates(7, 7);
    public final static Coordinates DRUNCARD_INITIAL_POSITION = new Coordinates(9, 0);

    public final static int SLEEP_DRUNKARD = 1;
    public final static int READY_DRUNKARD = 0;
    public final static int LAY_DRUNKARD = 2;

    public final static int NEW_DRUNKARD_FREQUENCY = 20;


}
