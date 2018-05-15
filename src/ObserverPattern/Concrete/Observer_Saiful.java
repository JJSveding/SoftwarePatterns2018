package ObserverPattern.Concrete;

import ObserverPattern.Observer;

public class Observer_Saiful implements Observer {
    @Override
    public void update(String videoTitle) {
        System.out.println("Observer_Saiful has been notified about the new video "+videoTitle);
    }
}
