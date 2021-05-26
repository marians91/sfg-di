package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.I18EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */

public class I18nEnglishGreetingService implements GreetingService {
    I18EnglishGreetingRepository i18EnglishGreetingRepository;

    public I18nEnglishGreetingService(I18EnglishGreetingRepository i18EnglishGreetingRepository) {
        this.i18EnglishGreetingRepository = i18EnglishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return i18EnglishGreetingRepository.sayGreeting();
    }
}
