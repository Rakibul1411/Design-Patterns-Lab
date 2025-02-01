import java.util.Observer;

public interface NotificationSubject {

    void registerObserver(NotificationObserver observer);

    void removeObserver(NotificationObserver observer);

    void notifyObservers(String message);
}
