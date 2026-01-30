package fr.pgu.greeting;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greet(String name) {
        return String.format("Hello %s ça va ?", name);
    }
}
