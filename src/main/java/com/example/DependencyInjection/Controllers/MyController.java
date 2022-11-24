package com.example.DependencyInjection.Controllers;


import com.example.DependencyInjection.Services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    private MyService myService;

    @Autowired
    public MyController(MyService myService){
        System.out.println("è stato chiamato il costruttore di MyController");
        this.myService = myService;
    }

    @GetMapping("")
    public String sayWelcome(){
        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("è stato chiamato il metodo getName di MyController");
        return myService.getName();
    }
}
