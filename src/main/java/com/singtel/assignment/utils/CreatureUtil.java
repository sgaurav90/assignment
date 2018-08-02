package com.singtel.assignment.utils;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.model.Parent;

import java.util.function.Predicate;

public class CreatureUtil {


    public static Predicate<Parent> canSing = (creature) ->
            creature.getSingable() != null && creature.getSingable() instanceof CanSing;

    public static Predicate<Parent> canWalk = (creature) ->
            creature.getWalkable() != null && creature.getWalkable() instanceof CanWalk;

    public static Predicate<Parent> canFly = (creature) ->
            creature.getFlyable() != null && creature.getFlyable() instanceof CanFly;

    public static Predicate<Parent> canSwim = (creature) ->
            creature.getSwimmable() != null && creature.getSwimmable() instanceof CanSwim;


    public static boolean canSing(Parent creature){
        return canSing.test(creature);
    }

    public static boolean canWalk(Parent creature){
        return canWalk.test(creature);
    }

    public static boolean canFly(Parent creature){
        return canFly.test(creature);
    }

    public static boolean canSwim(Parent creature){
        return canSwim.test(creature);
    }

}
