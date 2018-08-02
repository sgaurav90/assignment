package com.singtel.assignment.behaviours.impl.singable;

import com.singtel.assignment.utils.Creature;

public class ChickenSound extends CanSing{


    @Override
    public void sing() {
        System.out.println(Creature.CHICKEN);
    }

}
