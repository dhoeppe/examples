package com.example.hateoasdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableJpaRepositories
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class HateoasDemoApplication {
    @Autowired
    private ARepository aRepository;
    
    @Autowired
    private BRepository bRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(HateoasDemoApplication.class, args);
    }
    
    @EventListener
    public void initializeData(ApplicationReadyEvent event) {
        A a = new A();
        B b = new B();
        
        a.setName("a");
        b.setName("b");
        
        b.getAs().add(a);
        
        aRepository.save(a);
        bRepository.save(b);
    }
}
