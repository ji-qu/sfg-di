package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService2 createGreetingService(String lang) {

        switch (lang){
            case "DE":
                return new PrimaryGermanGreetingService2(greetingRepository);
            case "ES":
                return new PrimarySpanishGreetingService2(greetingRepository);
            case "EN":
            default:
                return new PrimaryEnglishGreetingService2(greetingRepository);
        }
    }
}
