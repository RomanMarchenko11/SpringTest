package trip;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("jazzMusic")
//@Scope("singleton")
//@Scope("prototype")
public class JazzMusic implements Music{
    @PostConstruct
    public void doMYInit() {
        System.out.println("Initiation Jazzzz :) ");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Stop initiation :)");
    }
    @Override
    public String getSong() {
        return "Dream a Little Dream of Me";
    }
}
