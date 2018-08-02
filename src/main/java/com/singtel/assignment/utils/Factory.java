package com.singtel.assignment.utils;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Parent;
import com.singtel.assignment.model.animals.Butterfly;
import com.singtel.assignment.model.animals.Cat;
import com.singtel.assignment.model.animals.Caterpillar;
import com.singtel.assignment.model.animals.Dog;
import com.singtel.assignment.model.birds.Chicken;
import com.singtel.assignment.model.birds.Duck;
import com.singtel.assignment.model.birds.Parrot;
import com.singtel.assignment.model.birds.Rooster;
import com.singtel.assignment.model.fish.Clownfish;
import com.singtel.assignment.model.fish.Dolphin;
import com.singtel.assignment.model.fish.Shark;

public class Factory {


    /**
     *
     * @param name
     * @return
     */
    public static Parent getInstance(String name){
        switch (name){
            case "animal":{
                return new Animal();
            }
            case "bird":{
                return new Bird();
            }
            case "butterfly":{
                return new Butterfly();
            }
            case "caterpillar":{
                return new Caterpillar();
            }
            case "chicken":{
                return new Chicken();
            }
            case "clownfish":{
                return new Clownfish();
            }
            case "dophin":{
                return new Dolphin();
            }
            case "duck":{
                return new Duck();
            }
            case "fish":{
                return new Fish();
            }
            case "parrot":{
                return new Parrot();
            }
            case "rooster":{
                return new Rooster();
            }
            case "shark":{
                return new Shark();
            }case "cat":{
                return new Cat();
            }
            case "dog":{
                return new Dog();
            }
            default:
                throw new UnsupportedOperationException("Unknown creature "+name);

        }
    }

}
