package guru.springframework.sfgdi.services;

public class PrimaryGermanGreetingService2 implements GreetingService2 {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService2(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
