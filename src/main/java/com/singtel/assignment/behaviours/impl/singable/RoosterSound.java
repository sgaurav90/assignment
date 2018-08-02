package com.singtel.assignment.behaviours.impl.singable;

import com.singtel.assignment.behaviours.Singable;

public class RoosterSound implements Singable {

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
