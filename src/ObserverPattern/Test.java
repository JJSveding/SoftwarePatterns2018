package ObserverPattern;

import ObserverPattern.Concrete.Observer_Edgaras;
import ObserverPattern.Concrete.Observer_Jens;
import ObserverPattern.Concrete.Observer_Saiful;
import ObserverPattern.Concrete.Subject_YoutubeChannel;

public class Test {

    public static void main(String[] args){

        Subject_YoutubeChannel youtubeChannel = new Subject_YoutubeChannel("Learning with Andrea");

        Observer_Jens jens = new Observer_Jens();
        Observer_Saiful saiful = new Observer_Saiful();
        Observer_Edgaras edgaras = new Observer_Edgaras();

        youtubeChannel.attach(jens);
        youtubeChannel.attach(saiful);
        youtubeChannel.attach(edgaras);

        Video video = new Video("Observer pattern with Andrea",30);


        youtubeChannel.addVideo(video);

    }

}
