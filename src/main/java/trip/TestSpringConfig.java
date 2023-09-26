package trip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("trip")
@PropertySource("classpath:musicPlayer.properties")
public class TestSpringConfig {
    @Bean
    public ClassicalMusic classicalBean() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockBean() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }


//    public

    @Bean
    public MusicPlayer musicPlayer1() {
        return new MusicPlayer(classicalBean());
    }
}
