package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.singable.CatSound;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.utils.Creature;

public class Cat extends Animal {

    public Cat(){
        this.type= Creature.CAT;
        this.singable= new CatSound();
    }
}
