package ObserverPattern.Concrete;

import ObserverPattern.Observer;

public class Observer_Edgaras implements Observer {
    @Override
    public void update(String videoTitle) {
        System.out.println("Observer_Edgaras has been notified about the new video "+videoTitle);
    }
}
