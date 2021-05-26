package guru.springframework.sfgdi.repositories;

public class I18EnglishGreetingRepositoryImpl implements I18EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello World - EN ";
    }
}
