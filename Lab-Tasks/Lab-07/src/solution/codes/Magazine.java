package solution.codes;

public class Magazine implements LibraryItem{
    private final String itemId;
    private final String title;
    private final String issue;
    private final boolean isRestricted;
    private boolean isAvailable;

    public Magazine(String itemId, String title, String issue, boolean isRestricted) {
        this.itemId = itemId;
        this.title = title;
        this.issue = issue;
        this.isRestricted = isRestricted;
    }

    @Override
    public String getDetails() {
        return String.format("Magazine - ID: %s, Title: %s, Issue: %s", itemId, title, issue);
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
