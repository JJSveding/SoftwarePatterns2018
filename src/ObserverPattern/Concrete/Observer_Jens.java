package ObserverPattern.Concrete;

import ObserverPattern.Observer;

public class Observer_Jens implements Observer {
    @Override
    public void update(String videoTitle) {
        System.out.println("Observer_Jens has been notified about the new video "+videoTitle);
    }
}
