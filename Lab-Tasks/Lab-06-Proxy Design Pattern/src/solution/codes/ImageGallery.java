package solution.codes;
import java.util.ArrayList;
import java.util.List;

public class ImageGallery {
    private final List<Image> images;

    public ImageGallery() {
        this.images = new ArrayList<>();
    }

    public void addImage(String filename, int size) {
        images.add(new ProxyImage(filename, size));
    }

    public void listImages() {
        System.out.println("\n=== Image Gallery Contents ===");
        for (int i = 0; i < images.size(); i++) {
            Image img = images.get(i);
            System.out.printf("%d. %s (%dKB)%n",
                    i + 1,
                    img.getFilename(),
                    img.getSize());
        }
        System.out.println("===========================");
    }

    public void displayImage(int index) {
        if (index >= 0 && index < images.size()) {
            Image selectedImage = images.get(index);
            System.out.println("\nSelected image: " + selectedImage.getFilename());
            selectedImage.display();
        } else {
            System.out.println("Invalid image selection!");
        }
    }

    public int getImageCount() {
        return images.size();
    }
}
