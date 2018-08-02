package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.utils.Creature;

public class Bird extends Parent{

    public Bird(){
        this.type= Creature.BIRD;
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}
