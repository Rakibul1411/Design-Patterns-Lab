package solution.codes;

import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess{
    private final Map<String, LibraryItem> items = new HashMap<>();

    public void addItem(LibraryItem item) {
        items.put(item.getItemId(), item);
    }

    @Override
    public LibraryItem accessItem(String itemId, User user) throws Exception {
        LibraryItem item = items.get(itemId);
        if (item == null) {
            throw new Exception("Item not found: " + itemId);
        }
        return item;
    }
}
