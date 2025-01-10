package solution.codes;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try {

            RealLibraryAccess realAccess = new RealLibraryAccess();
            LibraryAccessProxy accessProxy = new LibraryAccessProxy(realAccess);

            // Create some library items using factory
            LibraryItem book1 = LibraryItemFactory.createLibraryItem("book", "B-1",
                    "Design Patterns", "Gang of Four", false);
            LibraryItem book2 = LibraryItemFactory.createLibraryItem("book", "B-2",
                    "Restricted Book", "John Doe", true);
            LibraryItem magazine1 = LibraryItemFactory.createLibraryItem("magazine", "M-1",
                    "Tech Monthly", "Issue 45", false);

            // Add items to a library
            realAccess.addItem(book1);
            realAccess.addItem(book2);
            realAccess.addItem(magazine1);

            // Create users
            User regularUser = new User("U-1", "Alice", false);
            User privilegedUser = new User("U-2", "Bob", true);

            // Get library configuration
            LibraryConfigManager config = LibraryConfigManager.getInstance();
            System.out.println("Library opens at: " + config.getSetting("openingTime"));

            // Test access
            System.out.println("\nTesting access for regular user:");
            try {
                LibraryItem item1 = accessProxy.accessItem("B-1", regularUser);
                System.out.println("Access granted: " + item1.getDetails());

                LibraryItem item2 = accessProxy.accessItem("M-1", regularUser);
                System.out.println("Access granted: " + item2.getDetails());

                item1 = accessProxy.accessItem("B-2", regularUser);
                System.out.println("Access granted: " + item1.getDetails());
            }
            catch (Exception e) {
                System.out.println("Access error: " + e.getMessage());
            }

            System.out.println("\nTesting access for privileged user:");
            try {
                LibraryItem item = accessProxy.accessItem("B-2", privilegedUser);
                System.out.println("Access granted: " + item.getDetails());

                LibraryItem item1 = accessProxy.accessItem("B-1", regularUser);
                System.out.println("Access granted: " + item1.getDetails());

                LibraryItem item2 = accessProxy.accessItem("M-1", regularUser);
                System.out.println("Access granted: " + item2.getDetails());
            }
            catch (Exception e) {
                System.out.println("Access error: " + e.getMessage());
            }

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
