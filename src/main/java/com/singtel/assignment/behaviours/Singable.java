package com.singtel.assignment.behaviours;

import com.singtel.assignment.utils.Creature;

import java.util.Locale;
import java.util.ResourceBundle;

@FunctionalInterface
public interface Singable {

    void sing();

    default ResourceBundle getBundle(){
        Locale locale= Locale.getDefault();

        if(locale==null){
            locale= Locale.ENGLISH;
        }

        ResourceBundle bundleFR = ResourceBundle.getBundle("ApplicationMessages", locale);
        return bundleFR;
    }


    default String getSound(Creature creature){
      StringBuffer sound= new StringBuffer(creature.toString()).append(".sound");
      return    getBundle().getString(sound.toString());
    }

}
