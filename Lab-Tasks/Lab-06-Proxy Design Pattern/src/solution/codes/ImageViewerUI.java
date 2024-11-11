package solution.codes;

import java.util.Scanner;

public class ImageViewerUI {
    private final ImageGallery gallery;
    private final Scanner scanner;

    public ImageViewerUI() {
        this.gallery = new ImageGallery();
        this.scanner = new Scanner(System.in);
        initializeGallery();
    }

    private void initializeGallery() {
        gallery.addImage("image1.jpg", 8192);    // 8MB
        gallery.addImage("image2.jpg", 4096);    // 4MB
        gallery.addImage("image3.jpg", 6144);     // 6MB
        gallery.addImage("image4.jpg", 12288);     // 12MB
        gallery.addImage("image5.jpg", 7168); // 7MB
    }

    public void start() {
        while (true) {
            System.out.println("\n_______High-Resolution Image Viewer_______");
            System.out.println("1. List all images");
            System.out.println("2. View image");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    gallery.listImages();
                    break;
                case 2:
                    viewImage();
                    break;
                case 3:
                    System.out.println("Thank you for using Image Viewer!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void viewImage() {
        gallery.listImages();
        System.out.print("\nEnter the image number to view (1-" + gallery.getImageCount() + "): ");
        int selection = scanner.nextInt();
        gallery.displayImage(selection - 1);
    }
}
