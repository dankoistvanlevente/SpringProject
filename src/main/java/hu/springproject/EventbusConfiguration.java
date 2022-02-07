package hu.springproject;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventbusConfiguration {

    public EventbusConfiguration() {
        System.out.println("megtörtént");
    }

    @Bean
    public EventBus eventbus(){
        return new EventBus();
    }
}
