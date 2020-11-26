package guru.springframework.sfgdi.services;

public class PrimarySpanishGreetingService2 implements GreetingService2 {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService2(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
