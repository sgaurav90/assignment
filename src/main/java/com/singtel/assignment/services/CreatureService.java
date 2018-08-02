package com.singtel.assignment.services;


/**
 *
 */
public interface CreatureService {


    public String getSound(String livingBeimg);

    Boolean canWalk(String name);

    Boolean canSing(String name);

    Boolean canSwim(String name);

    Boolean canFly(String name);
}
