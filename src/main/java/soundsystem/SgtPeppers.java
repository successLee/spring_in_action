package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by LL on 2016/12/2.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Peppers Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
