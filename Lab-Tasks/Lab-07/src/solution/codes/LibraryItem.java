package solution.codes;

public interface LibraryItem {
    String getDetails();
    boolean borrowItem(User user);
    String getItemId();
    boolean isRestricted();
}
