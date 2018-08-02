package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.Flyable;
import com.singtel.assignment.behaviours.Singable;
import com.singtel.assignment.behaviours.Walkable;

public abstract class Parent {

    Walkable walkable;
    Flyable flyable;
    Singable singable;

    /**
     * Need to be refactored
     */
    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }
}
