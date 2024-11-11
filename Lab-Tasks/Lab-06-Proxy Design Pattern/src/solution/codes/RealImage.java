package solution.codes;

public class RealImage implements Image{
    private String filename;
    private int size;
    private byte[] imageData;

    public RealImage(String filename, int size) {
        this.filename = filename;
        this.size = size;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading high-resolution image: " + filename);
        System.out.println("Loading " + size + "KB of image data...");

        imageData = new byte[size * 1024];
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image loaded successfully!");
    }

    public void display() {
        System.out.println("Displaying high-resolution image: " + filename);
        System.out.println("Resolution: 4K (3840x2160)");
        System.out.println("Memory used: " + size + "KB");
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
