package solution.codes;

public class Book implements LibraryItem{
    private final String itemId;
    private final String title;
    private final String author;
    private final boolean isRestricted;
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author, boolean isRestricted) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isRestricted = isRestricted;
    }

    @Override
    public String getDetails() {
        return String.format("Book - ID: %s, Title: %s, Author: %s", itemId, title, author);
    }

    @Override
    public boolean borrowItem(User user) {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public String getItemId() {
        return itemId;
    }

    @Override
    public boolean isRestricted() {
        return isRestricted;
    }
}
