package com.turkcell.spring.starter.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController
{
    // ? => Sistem gelen istegi spesifik olarak TEK bir tane fonksiyona yonlendiriyorsa sorun yoktur.
    @GetMapping
    public String get(@RequestParam String name)
    {
        return "Merhaba" +name;
    }
    @PostMapping()
    public String a(@RequestBody int number)
    {
        return "Merhaba post mapping "+number;
    }
    @GetMapping("{page}")
    public String b( @PathVariable int page)
    {
        return "Get Request 2"+page;
    }

}

// Entity
