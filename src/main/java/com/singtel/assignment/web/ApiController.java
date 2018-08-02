package com.singtel.assignment.web;


import com.singtel.assignment.services.CreatureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final CreatureService creatureService;

    public ApiController(CreatureService creatureService){
        this.creatureService=creatureService;
    }

    @GetMapping("/sound/{name}")
    public String getSound(@PathVariable String name){
      return this.creatureService.getSound(name);
    }


    @GetMapping("/canwalk/{name}")
    public Boolean canWalk(@PathVariable String name){
        return this.creatureService.canWalk(name);
    }

    @GetMapping("/cansing/{name}")
    public Boolean canSing(@PathVariable String name){
        return this.creatureService.canSing(name);
    }

    @GetMapping("/canswim/{name}")
    public Boolean canSwim(@PathVariable String name){
        return this.creatureService.canSwim(name);
    }

    @GetMapping("/canfly/{name}")
    public Boolean canFly(@PathVariable String name){
        return this.creatureService.canFly(name);
    }
}
