package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingRepository;
import guru.springframework.sfgdi.services.GreetingService2;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Qualifier("greetingService2Impl")
    @Profile({"default", "EN"})
    GreetingService2 primaryEnglishGreetingService2(GreetingServiceFactory greetingServiceFactory){
        System.out.println("Profile EN");
        return greetingServiceFactory.createGreetingService("EN");
    }

    @Bean
    @Primary
    @Qualifier("greetingService2Impl")
    @Profile("ES")
    GreetingService2 primarySpanishGreetingService2(GreetingServiceFactory greetingServiceFactory){
        System.out.println("Profile ES");
        return greetingServiceFactory.createGreetingService("ES");
    }

    @Bean
    @Primary
    @Qualifier("greetingService2Impl")
    @Profile("DE")
    GreetingService2 primaryGermanGreetingService2(GreetingServiceFactory greetingServiceFactory){
        System.out.println("Profile DE");
        return greetingServiceFactory.createGreetingService("DE");
    }
}
