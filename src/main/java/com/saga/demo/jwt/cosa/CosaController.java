package com.saga.demo.jwt.cosa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CosaController {

    @GetMapping(value = {"/cosas/{id}", "/cosas/{id}/",
            "/cosas/{id}/mas", "/cosas/{id}/menos",
            "/cosas/{id}/mas/", "/cosas/{id}/menos/"})
    public Cosa getCosa(@PathVariable("id") String id) {
        return new Cosa(id,"Cosa creada en el aire");
    }

}
