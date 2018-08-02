package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.flyable.CanNotFly;
import com.singtel.assignment.behaviours.impl.walkable.CrawlWalk;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.utils.Creature;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.type= Creature.CATTERPILLAR;
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
