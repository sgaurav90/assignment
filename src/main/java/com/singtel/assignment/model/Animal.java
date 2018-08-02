package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.utils.Creature;

public class Animal extends Parent {

    public Animal(){
        this.type= Creature.ANIMAL;
        this.walkable=new CanWalk();
    }
}
