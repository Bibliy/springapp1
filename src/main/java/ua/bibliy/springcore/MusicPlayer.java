package ua.bibliy.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private  int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private  Music music2;

@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music1=" + music1 +
                ", music2=" + music2 +
                '}';
    }

public String playMusic(){
    return "Playing " + music1.getSong() + " and " + music2.getSong();
}
    //    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }


//    public MusicPlayer(Music music) {
//       this.music = music;
//    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public  MusicPlayer(){}
//    //IoControl

//@Autowired
//    public void seticMusic(Music music) {
//        this.music = music;
//    }

//    public  String  playMusic(){
//        return "Playing music: " + classicalMusic.getSong() + " and " +
//                rockMusic.getSong();
//        System.out.println("Playing music: " + rockMusic.getSong());
    }

