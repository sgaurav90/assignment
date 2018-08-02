package com.singtel.assignment.model.birds;

import com.singtel.assignment.behaviours.impl.flyable.CanNotFly;
import com.singtel.assignment.behaviours.impl.singable.ChickenSound;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.utils.Creature;

public class Chicken extends Bird {

    public  Chicken(){
        this.type= Creature.CHICKEN;
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
