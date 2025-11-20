import br.com.audioplayer.modelos.Music;
import br.com.audioplayer.modelos.MyPreferences;
import br.com.audioplayer.modelos.Podcast;

public class Main {
static void main(String[] args) {

    Music myMusic = new Music();
    myMusic.setTitle("Way Maker");
    myMusic.setSinger("Sinach");

    for (int i = 0; i < 1000; i++) {
        myMusic.play();
    }

    for (int i = 0; i < 50; i++) {
        myMusic.like();
    }

    Podcast myPodcast = new Podcast();
    myPodcast.setTitle("Jesus Copy");
    myPodcast.setHost("Douglas Gonçalves");

    for (int i = 0; i < 5000; i++) {
        myPodcast.play();
    }

    for (int i = 0; i < 1000; i++) {
        myPodcast.like();

    }

    MyPreferences preferences = new MyPreferences();
    preferences.include(myPodcast);
    preferences.include(myMusic);
}
}