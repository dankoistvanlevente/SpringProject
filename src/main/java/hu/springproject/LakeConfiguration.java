package hu.springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LakeConfiguration {

    public LakeConfiguration(){

    }

    @Bean
    public Lake lake(){
        return new Lake();
    }

}
