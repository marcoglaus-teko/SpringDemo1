package ch.teko.prg.springdemo1;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public FirstService() {
        System.out.println("Constructor from class FirstService is called!");
    }

    @EventListener(value = ApplicationReadyEvent.class)
    public void init() {
        System.out.println("Application is up and running!");
    }

}
