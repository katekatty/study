package ru.spbau.ustuzhanina.drunkard.GameZone;

import ru.spbau.ustuzhanina.drunkard.Objects.Emptyobject;
import ru.spbau.ustuzhanina.drunkard.Objects.Object;

/**
 * Created by KateKate on 01.03.14.
 */

public class Ceil {
    private Object object;

    public Ceil() {
        this.object = new Emptyobject();
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void delObject() {
        this.object = new Emptyobject();
    }

}
