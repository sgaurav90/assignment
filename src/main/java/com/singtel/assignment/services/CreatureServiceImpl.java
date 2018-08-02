package com.singtel.assignment.services;

import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.model.Parent;
import com.singtel.assignment.utils.CreatureUtil;
import com.singtel.assignment.utils.Factory;
import org.springframework.stereotype.Service;

@Service
public class CreatureServiceImpl implements CreatureService {
    @Override
    public String getSound(String livingBeing) {

        Parent obj= Factory.getInstance(livingBeing);

        if(obj!=null && obj.getSingable()!=null){
          return obj.getSingable().getSound(obj.getType());
        }

        return "Not available";
    }

    @Override
    public Boolean canWalk(String name) {
        Parent obj= Factory.getInstance(name);
        return CreatureUtil.canWalk(obj);
    }

    @Override
    public Boolean canSing(String name) {
        Parent obj= Factory.getInstance(name);
        return CreatureUtil.canSing(obj);
    }

    @Override
    public Boolean canSwim(String name) {
        Parent obj= Factory.getInstance(name);
        return CreatureUtil.canSwim(obj);
    }

    @Override
    public Boolean canFly(String name) {
        Parent obj= Factory.getInstance(name);
        return CreatureUtil.canFly(obj);
    }
}
