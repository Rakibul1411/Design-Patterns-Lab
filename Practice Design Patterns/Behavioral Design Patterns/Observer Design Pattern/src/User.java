public class User implements NotificationObserver{
    private final String userName;

    public User(String userName){
        this.userName = userName;
    }

    @Override
    public void update(String pageName, String message) {
        System.out.println("Hi " + userName + ", new notification from " + pageName + ": " + message);
    }
}
