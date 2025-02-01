public class File implements Component{
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "File: " + fileName);
    }
}
