import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{
    private final String name;
    private final List<Component> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add (Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "Folder " + name);
        for (Component component : children) {
            component.display(indent + 4);
        }
    }
}
