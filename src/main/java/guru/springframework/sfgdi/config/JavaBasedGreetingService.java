package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.I18EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.I18EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@PropertySource("${classpath:datasoruce.properties}")
@Configuration
public class JavaBasedGreetingService {

    @Bean
    public FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                         @Value("${guru.password}") String password,
                                         @Value("${guru.jdbcurl}")String jbdcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setJdbcUrl(jbdcurl);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUsername(username);
        return  fakeDataSource;

    }

    @Bean
    public I18EnglishGreetingRepository i18EnglishGreetingRepository() {
        return new I18EnglishGreetingRepositoryImpl();
    }

    ;

    @Profile("EN")
    @Bean("i18nService")
    public I18nEnglishGreetingService i18nEnglishGreetingService(
            I18EnglishGreetingRepository i18EnglishGreetingRepository) {
        return new I18nEnglishGreetingService(i18EnglishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    public I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

}
