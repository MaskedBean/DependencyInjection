package com.example.DependencyInjection.Components;

import org.springframework.stereotype.Component;


@Component
public class MyComponent {

    private String myComponentName;

        public MyComponent(){
            System.out.println("è stato chiamato il costruttore di MyComponent");
            this.myComponentName = "Alessandro Serra";
        }

        public String getMyComponentName(){
            System.out.println("è stato chiamato il metodo getMyComponentName di MyComponent");
            return myComponentName;
        }

}