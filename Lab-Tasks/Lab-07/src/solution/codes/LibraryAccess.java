package solution.codes;

public interface LibraryAccess {
    LibraryItem accessItem(String itemId, User user) throws Exception;
}
