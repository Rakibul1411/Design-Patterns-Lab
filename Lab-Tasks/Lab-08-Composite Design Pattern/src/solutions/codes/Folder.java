package solutions.codes;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private final String fileName;
    private final List<FileSystemComponent> components;

    public Folder(String fileName) {
        this.fileName = fileName;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        this.components.add(component);
    }

    @Override
    public boolean searchKey(String keyword) {
        for (FileSystemComponent component : components) {
            if (component.searchKey(keyword)) {
                return true;
            }
        }
        return false;
    }
}
