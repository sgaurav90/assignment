package com.singtel.assignment.model.fish;

import com.singtel.assignment.model.Fish;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Creature;
import com.singtel.assignment.utils.Size;

public class Shark  extends Fish {


    public  Shark(){
        this.type= Creature.SHARK;
        this.size= Size.LARGE;
        this.color=Color.GREY;
    }
}
