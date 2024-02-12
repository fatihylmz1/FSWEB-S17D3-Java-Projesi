package com.example.workintech.zoo.zoo.controller;

import com.example.workintech.zoo.zoo.entity.Kangaroo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class KangarooController {

    private Map<Long,Kangaroo> kangaroos = new HashMap<>();

    @GetMapping("/workintech/kangaroos")
    public List<Kangaroo> showAllKangaroos(){
        return kangaroos.values().stream().toList();
    }
    @GetMapping("/workintech/kangaroos/{id}")
    public Kangaroo showKangarooById(@PathVariable Long id){
        return kangaroos.get(id);
    }

    @PostMapping("/workintech/kangaroos")
    public Kangaroo addKangaroo(@RequestBody Kangaroo kangaroo){
        return kangaroos.put(kangaroo.getId(), kangaroo);
    }

    @PutMapping("/workintech/kangaroos/{id} ")
    public Kangaroo updateKangaroo(@PathVariable Long id ,@RequestBody Kangaroo kangaroo ){
            kangaroos.put(id , new Kangaroo(id , kangaroo.getName(),kangaroo.getWeight(),kangaroo.getHeight(),kangaroo.getGender(),
                    kangaroo.isAggressive()));
            return kangaroos.get(id);
    }

    @DeleteMapping("/workintech/developers/{id}")
    public Kangaroo deleteKangaroo(@PathVariable Long id){
        Kangaroo kangaroo = kangaroos.get(id);
        kangaroos.remove(id);
        return kangaroo;
    }

}
