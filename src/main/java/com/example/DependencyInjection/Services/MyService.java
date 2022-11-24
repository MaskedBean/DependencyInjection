package com.example.DependencyInjection.Services;

import com.example.DependencyInjection.Components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    private MyComponent myComponent;


        @Autowired
        public MyService(MyComponent myComponent){
            System.out.println("è stato chiamato il costruttore di MyService");
            this.myComponent = myComponent;
        }

        public String getName(){
            System.out.println("è stato chiamato il metodo getName di MyService");
            return myComponent.getMyComponentName();
        }

}
