package com.singtel.assignment;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Bird;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BirdTest {


    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void testWalk(){
        Bird bird= new Bird();
        bird.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }


    @Test
    public void testFly(){
        Bird bird= new Bird();
        bird.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing(){
        Bird bird= new Bird();
        bird.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }
}
