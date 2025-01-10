package solution.codes;

public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String itemId, String title, String authorOrIssue, boolean isRestricted) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(itemId, title, authorOrIssue, isRestricted);
        }
        else if (type.equalsIgnoreCase("magazine")) {
            return new Magazine(itemId, title, authorOrIssue, isRestricted);
        }
        else {
            throw new IllegalArgumentException("Unknown library item type: " + type);
        }
    }
}
