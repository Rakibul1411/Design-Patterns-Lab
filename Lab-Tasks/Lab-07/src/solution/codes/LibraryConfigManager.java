package solution.codes;

import java.util.HashMap;
import java.util.Map;

public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private final Map<String, Object> settings;

    private LibraryConfigManager() {
        settings = new HashMap<>();
        initializeDefaultSettings();
    }

    public static synchronized LibraryConfigManager getInstance() {
        if (instance == null) {
            synchronized (LibraryConfigManager.class) {
                if (instance == null) {
                    instance = new LibraryConfigManager();
                }
            }
        }

        return instance;
    }

    private void initializeDefaultSettings() {
        settings.put("lateFeePerDay", 5.0);
        settings.put("maxBorrowDays", 7);
        settings.put("openingTime", "10:00");
        settings.put("closingTime", "17:00");
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }

    public void updateSetting(String key, Object value) {
        settings.put(key, value);
    }
}
