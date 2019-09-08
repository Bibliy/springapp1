package ua.bibliy.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialisation");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
