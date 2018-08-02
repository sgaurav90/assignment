package com.singtel.assignment;

import com.singtel.assignment.model.Animal;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalTest {

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void testWalk(){
        Animal animal= new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }
}
