import java.util.ArrayList;
import java.util.List;

abstract class Container extends Component {
    protected List<Component> children = new ArrayList<>();

    public void addChild(Component child) {
        children.add(child);
        child.setContainer(this);
    }
}
