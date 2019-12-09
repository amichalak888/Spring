package com.example.demo.controller;

import com.example.demo.Repository.HobbitRepository;
import com.example.demo.model.Hobbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HobbitController {
    // localhost8080/hello Ala
    @Autowired

    private HobbitRepository hobbitRepository;


    @GetMapping("/hello")
    public String hello() {


        return "Hello Ala";
    }

    @GetMapping("/moje-hobbity")
    public Iterable<Hobbit> mojeHobbity() {
       // System.out.println(hobbitRepository);
        return hobbitRepository.findAll();
    }


}
