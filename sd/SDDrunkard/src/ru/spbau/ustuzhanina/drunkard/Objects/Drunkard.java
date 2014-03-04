package ru.spbau.ustuzhanina.drunkard.Objects;

import ru.spbau.ustuzhanina.drunkard.Constants;
import ru.spbau.ustuzhanina.drunkard.GameZone.Coordinates;
import ru.spbau.ustuzhanina.drunkard.GameZone.Field;

/**
 * Created by KateKate on 01.03.14.
 */
public class Drunkard extends Object {
    private int drunkardState;
    private boolean withBottle;

    public Drunkard(Field field) {
        setState(Constants.BUSY_CEIL);
        setActor(Constants.DRUNKARD_ACTOR);
        setSymbolToPrint(Constants.DRUNKARD_CEIL_SYMBOL);
        setPosition(Constants.DRUNCARD_INITIAL_POSITION);
        setField(field);
        drunkardState = Constants.READY_DRUNKARD;
        withBottle = true;
    }


    public void randStep() {
        Coordinates newPosition = generateNewPositioin();

        if (getField().isCeilAvailable(newPosition)) {
            getField().delObject(getPosition(), this);
            handleDrunkardBottle();
            getField().setObject(newPosition, this);
            setPosition(newPosition);
        } else {
            if (!getField().isWallBorder(newPosition)) {
                if (isBottleHere(newPosition)) {
                    setDrunkardState(Constants.LAY_DRUNKARD);
                    setSymbolToPrint(Constants.DRUNKARD_LAY_CEIL_SYMBOL);
                } else if (isColumnHere(newPosition)) {
                    setDrunkardState(Constants.SLEEP_DRUNKARD);
                    setSymbolToPrint(Constants.DRUNKARD_SLEEP_CEIL_SYMBOL);
                } else if (isSleepDrunkurdHere(newPosition)) {
                    setDrunkardState(Constants.SLEEP_DRUNKARD);
                    setSymbolToPrint(Constants.DRUNKARD_SLEEP_CEIL_SYMBOL);
                }
            }
        }
    }

    private void handleDrunkardBottle() {
        if (isWithBottle()) {
            int randLeaveBottle = (int) (Math.random() * 300);
            if (randLeaveBottle <= 10) {
                setWithBottle(false);
                getField().setObject(getPosition(), new Bottle(getPosition()));
            }
        }
    }

    private Coordinates generateNewPositioin() {
        int direction = (int) (Math.random() * 100);
        Coordinates newPosition;
        //down
        if (direction < 25) {
            newPosition = new Coordinates(getPosition().getX() - 1, getPosition().getY());
            //up
        } else if (direction < 50) {
            newPosition = new Coordinates(getPosition().getX(), getPosition().getY() - 1);
            //down
        } else if (direction < 75) {
            newPosition = new Coordinates(getPosition().getX(), getPosition().getY() + 1);
            //right
        } else {
            newPosition = new Coordinates(getPosition().getX() + 1, getPosition().getY());
        }
        return newPosition;
    }

    private boolean isBottleHere(Coordinates position) {
        if (getField().getCeil(position).getObject().getActor() == Constants.BOTTLE_ACTOR) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isColumnHere(Coordinates position) {
        if (getField().getCeil(position).getObject().getActor() == Constants.COLUMN_ACTOR) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isSleepDrunkurdHere(Coordinates position) {
        if ((getField().getCeil(position).getObject().getActor() == Constants.DRUNKARD_ACTOR) && (this.getDrunkardState() == Constants.SLEEP_DRUNKARD)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWithBottle() {
        return withBottle;
    }

    public void setWithBottle(boolean withBottle) {
        this.withBottle = withBottle;
    }

    public int getDrunkardState() {
        return drunkardState;
    }

    public void setDrunkardState(int drunkardState) {
        this.drunkardState = drunkardState;
    }

}
