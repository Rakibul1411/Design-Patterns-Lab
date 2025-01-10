package solution.codes;

import java.util.Date;

public class LibraryAccessProxy implements LibraryAccess{
    private final RealLibraryAccess realAccess;

    public LibraryAccessProxy(RealLibraryAccess realAccess) {
        this.realAccess = realAccess;
    }

    @Override
    public LibraryItem accessItem(String itemId, User user) throws Exception {
        LibraryItem item = realAccess.accessItem(itemId, user);

        if (item.isRestricted() && !user.hasRestrictedAccess()) {
            throw new Exception("Access denied: This item requires special permissions");
        }

        // Log access
        System.out.printf("User %s accessed item %s at %s%n",
                user.getName(), itemId, new Date());

        return item;
    }
}
