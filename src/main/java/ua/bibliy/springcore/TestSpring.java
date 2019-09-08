package ua.bibliy.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("classicalMusic",Music.class);
        //IoC
        //MusicPlayer musicPlayer = new MusicPlayer(music);

       // Music music1 = context.getBean("rockMusic",Music.class);
       // MusicPlayer musicPlayer1 = new MusicPlayer(music1);



        //внедрили в конструктор нашего объекта зависимость из нашего контекста
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        ClassicalMusic classicalMusic = context.getBean("musicBean2",ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        musicPlayer.playMusic();
        //musicPlayer1.playMusic();
//
//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName() + "\n" + musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic);
        context.close();
//        System.out.println(musicPlayer.getName() + "\n" + musicPlayer.getVolume());
    }
}
