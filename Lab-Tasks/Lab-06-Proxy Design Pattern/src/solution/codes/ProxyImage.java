package solution.codes;

public class ProxyImage implements Image{
    private RealImage realImage;
    private final String filename;
    private final int size;

    public ProxyImage(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename, size);
        }
        realImage.display();
    }

    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public int getSize() {
        return size;
    }
}
