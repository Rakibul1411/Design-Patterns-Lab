import java.util.HashMap;
import java.util.Map;

// Factory Provider
public class GUIFactoryProvider {
  
  public static Map<String, GUIFactory> factoryMap = new HashMap<>();

  static {
    factoryMap.put("Windows", new WindowsFactory());
    factoryMap.put("Mac", new MacFactory());
    factoryMap.put("Linux", new LinuxFactory());
  }

  public static GUIFactory getFactory(String osType) {
    GUIFactory factory = factoryMap.get(osType);
    if (factory == null) {
        throw new IllegalArgumentException("Unknown OS type: " + osType);
    }
    return factory;
  }

}
