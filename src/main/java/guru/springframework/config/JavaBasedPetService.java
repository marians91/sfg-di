package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class JavaBasedPetService {

    @Bean
    @Profile("cat")
    public CatPetService catPetService(){
        return new CatPetService();
    }
    @Bean
    @Profile({"dog","default"})
    public DogPetService dogPetService(){
        return new DogPetService();
    }
}
