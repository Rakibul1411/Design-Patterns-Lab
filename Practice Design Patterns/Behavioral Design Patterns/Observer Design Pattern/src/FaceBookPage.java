import java.util.ArrayList;
import java.util.List;

public class FaceBookPage implements NotificationSubject {
    private final String pageName;
    private final List<NotificationObserver> observers = new ArrayList<>();

    public FaceBookPage(String pageName) {
        this.pageName = pageName;
    }

    @Override
    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (NotificationObserver observer : observers) {
            observer.update(pageName, message);
        }
    }

    // Simulate posting an update
    public void postUpdate(String update) {
        System.out.println("FaceBook page: '" + pageName + "' posted: " + update);
        notifyObservers(update);
    }
}
