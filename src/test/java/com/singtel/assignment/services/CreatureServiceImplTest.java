package com.singtel.assignment.services;

import com.singtel.assignment.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureServiceImplTest extends AbstractTest {

    private CreatureService creatureService;

    @Before
    public void setUp(){
        this.creatureService=new CreatureServiceImpl();
    }

    @Test
    public void testCanFly(){
       boolean chickenCanFly= creatureService.canFly("chicken");
        boolean birdCanFly= creatureService.canFly("bird");

        assertEquals(false,chickenCanFly);
        assertEquals(true,birdCanFly);
    }

    @Test
    public void testCanSwim(){
        boolean fishCanSwim= creatureService.canSwim("fish");
        boolean animalCanSwim= creatureService.canSwim("animal");

        assertEquals(true,fishCanSwim);
        assertEquals(false,animalCanSwim);
    }

    @Test
    public void testCanWalk(){
        boolean fishCanWalk= creatureService.canWalk("fish");
        boolean birdCanWalk= creatureService.canWalk("bird");

        assertEquals(false,fishCanWalk);
        assertEquals(true,birdCanWalk);
    }

    @Test
    public void testCanSing(){
        boolean fishCanSing= creatureService.canSing("fish");
        boolean chickenCanSing= creatureService.canSing("chicken");

        assertEquals(false,fishCanSing);
        assertEquals(true,chickenCanSing);
    }
}
