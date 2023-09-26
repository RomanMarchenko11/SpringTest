package trip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
/*
Створити Spring Boot проєкт та bean з різними скоупами, сервіс який би повертав колекцію ін меморі
(яка створюється на момент підіймання проєкту).
 */

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
// створення бінів та залежностей
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
// створення біну з полями
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer1", MusicPlayer.class);
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());
// створення біну з передачею значень полів через файл
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());
// створення колекції та вивід на консоль
        MusicPlayer musicPlayerList = context.getBean("musicPlayerList", MusicPlayer.class);
        musicPlayerList.playMusicList();
// створення bean fabric-method and scope prototype (getBean створює нові об'єкти)
        HipHopMusic hipHopMusic = context.getBean("musicFabricBean", HipHopMusic.class);
        HipHopMusic hipHopMusic1 = context.getBean("musicFabricBean", HipHopMusic.class);
        HipHopMusic hipHopMusic2 = context.getBean("musicFabricBean", HipHopMusic.class);
        System.out.println(hipHopMusic);
        hipHopMusic.getSong();
        System.out.println(hipHopMusic1);
        hipHopMusic1.getSong();
        System.out.println(hipHopMusic2);
        hipHopMusic2.getSong();
// створення bean за допомогою анотацій
        Music jazz = context.getBean("jazzMusic", JazzMusic.class);
        System.out.println("Jazz song: " + jazz.getSong());
        MusicPlayer musicPlayer3 = new MusicPlayer(jazz);
        musicPlayer3.playMusic();
// cтворення рефлексії за допомогою анотацій
        DigitalMusicPlayer digitalMusicPlayer = context.getBean("digitalMusicPlayer",DigitalMusicPlayer.class);
        digitalMusicPlayer.playMusic();
        System.out.println(digitalMusicPlayer.getName());
        System.out.println(digitalMusicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
// створення Scope singleton за допомогою анотацій
        JazzMusic jazz1 = context.getBean("jazzMusic", JazzMusic.class);
        JazzMusic jazz2 = context.getBean("jazzMusic", JazzMusic.class);

        System.out.println(jazz1 == jazz2);

        context.close();

// створення бінов за допомогою Java коду та анотацій
        System.out.println("-------Java code and annotation-------");
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(TestSpringConfig.class);
        MusicPlayer musicPlayer4 = context1.getBean("musicPlayer1", MusicPlayer.class);
        System.out.println(musicPlayer4.getName());
        System.out.println(musicPlayer4.getVolume());

    }
}
