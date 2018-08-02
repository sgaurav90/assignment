package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanNotSing;
import com.singtel.assignment.utils.Creature;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.type= Creature.BUTTERFLY;
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}
