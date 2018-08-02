package com.singtel.assignment.model.fish;

import com.singtel.assignment.model.Fish;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Creature;
import com.singtel.assignment.utils.Size;

public class Clownfish extends Fish {

    public Clownfish(){
        this.type= Creature.CLOWFISH;
        this.color=Color.ORANGE;
        this.size=Size.SMALL;
    }
}
