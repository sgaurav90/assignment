package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviours.impl.swimmable.GreatSwimmers;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Parent;
import com.singtel.assignment.utils.Creature;

public class Dolphin extends Parent {

    Fish fish;

    public Dolphin(){
        this.type= Creature.DOLPHIN;
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
