package ru.spbau.ustuzhanina.drunkard;

import ru.spbau.ustuzhanina.drunkard.GameZone.Field;
import ru.spbau.ustuzhanina.drunkard.Objects.Drunkard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KateKate on 02.03.14.
 */
public class Game {
    private Field field;
    private List<Drunkard> gameObject;

    Game() {
        field = new Field();
        gameObject = new ArrayList<Drunkard>();
    }

    private void oneGameStep(int numberOfGameStep) {
        List<Drunkard> nonActive = new ArrayList<Drunkard>();
        if (numberOfGameStep % Constants.NEW_DRUNKARD_FREQUENCY == 0) {
            if (!field.getCeil(Constants.DRUNCARD_INITIAL_POSITION).getObject().isState()) {
                Drunkard drunkard = new Drunkard(field);
                gameObject.add(drunkard);
                field.setObject(Constants.DRUNCARD_INITIAL_POSITION, drunkard);
                field.printFieldState();
            }
        }
        //gameStep
        for (Drunkard obj : gameObject) {
            if (obj.getDrunkardState() == Constants.READY_DRUNKARD) {
                obj.randStep();
            } else {
                nonActive.add(obj);
            }
            field.printFieldState();
        }

        for (Drunkard obj : nonActive) {
            gameObject.remove(obj);
        }
        windowDelay();
    }

    public void gameRun() {
        int i = 0;
        while (!gameStop()) {
            oneGameStep(i);
            i++;
        }
    }

    private boolean gameStop() {
        if ((gameObject.size() == 0) && field.getCeil(Constants.DRUNCARD_INITIAL_POSITION).getObject().isState()) {
            return true;
        } else {
            return false;
        }
    }

    private void windowDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.print('\r');
    }

}
