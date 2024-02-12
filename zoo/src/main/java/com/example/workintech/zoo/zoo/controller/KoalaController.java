package com.example.workintech.zoo.zoo.controller;

import com.example.workintech.zoo.zoo.entity.Kangaroo;
import com.example.workintech.zoo.zoo.entity.Koala;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KoalaController {

    private Map<Long, Koala> koalas = new HashMap<>();

    @GetMapping("/workintech/koalas")
    public List<Koala> showAllKoalas(){
        return koalas.values().stream().toList();
    }
    @GetMapping("/workintech/koalas/{id}")
    public Koala showKoalasById(@PathVariable Long id){
        return koalas.get(id);
    }

    @PostMapping("/workintech/koalas")
    public Koala addKoala(@RequestBody Koala koala){
        return koalas.put(koala.getId(), koala);
    }

    @PutMapping("/workintech/koalas/{id} ")
    public Koala updateKoala(@PathVariable Long id ,@RequestBody Koala koala ){
        koalas.put(id , new Koala(id , koala.getName(),koala.getWeight(),koala.getSleepHour(),koala.getGender()));
        return koalas.get(id);
    }

    @DeleteMapping("/workintech/koalas/{id}")
    public Koala deleteKoala(@PathVariable Long id){
        Koala koala = koalas.get(id);
        koalas.remove(id);
        return koala;
    }
}
