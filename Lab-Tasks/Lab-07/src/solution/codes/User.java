package solution.codes;

public class User {
    private final String userId;
    private final String name;
    private final boolean hasRestrictedAccess;

    public User(String userId, String name, boolean hasRestrictedAccess) {
        this.userId = userId;
        this.name = name;
        this.hasRestrictedAccess = hasRestrictedAccess;
    }

    public boolean hasRestrictedAccess() {
        return hasRestrictedAccess;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
