package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Constructor Singleton!");
    }

    public String getMytype() {
        return "im a singleton!!!";
    }
}
