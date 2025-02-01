public class Main {
    public static void main(String[] args) {
        FaceBookPage fbPage = new FaceBookPage("III Family");

        User user1 = new User("abc");
        User user2 = new User("def");

        fbPage.registerObserver(user1);
        fbPage.registerObserver(user2);

        fbPage.postUpdate("Update post A");
        fbPage.postUpdate("Update post B");

        fbPage.removeObserver(user2);

        fbPage.postUpdate("Update post C");
    }
}
