package guru.springframework.sfgdi.services;

public class PrimaryEnglishGreetingService2 implements GreetingService2 {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService2(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
