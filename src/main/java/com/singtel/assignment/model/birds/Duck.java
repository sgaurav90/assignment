package com.singtel.assignment.model.birds;

import com.singtel.assignment.behaviours.impl.singable.DuckSound;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.utils.Creature;

public class Duck extends Bird {

    public Duck(){
        this.type= Creature.DUCK;
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
