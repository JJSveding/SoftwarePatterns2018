package ObserverPattern.Concrete;

import ObserverPattern.Observer;
import ObserverPattern.Subject;
import ObserverPattern.Video;

import java.util.ArrayList;
import java.util.List;

public class Subject_YoutubeChannel implements Subject {
    private String name;

    //List of Observers
    private List<Observer> list = new ArrayList<>();

    //Youtube channel has a list of videos. Not part of pattern
    private List<Video> videos = new ArrayList<>();

    //Constructor. Parameter: Youtube channel name
    public Subject_YoutubeChannel(String name){
        this.name = name;
    }


    //Add video and notify observers
    public void addVideo(Video video)
    {
        videos.add(video);
        if(video.getDuration() < 300){
            notifyObservers(video.getTitle());
        }

    }

    //Attach new observer
    @Override
    public void attach(Observer o) {
        list.add(o);
    }

    //Detach observer
    @Override
    public void detach(Observer o) {
        list.remove(o);
    }

    //Notify observers and call their update method.
    @Override
    public void notifyObservers(String videoTitle) {
        list.forEach((o) -> {
            o.update(videoTitle);
        });
    }
}
