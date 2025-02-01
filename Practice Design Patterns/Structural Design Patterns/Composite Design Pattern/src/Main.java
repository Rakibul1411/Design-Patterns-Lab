public class Main {
    public static void main(String[] args) {
        Component file1 = new File("Resume.docx");
        Component file2 = new File("CoverLetter.pdf");
        Component file3 = new File("beach.png");
        Component file4 = new File("mountain.jpg");
        Component file5 = new File("profile.jpg");
        Component file6 = new File("README.txt");

        Folder root = new Folder("Root Folder");
        Folder documents = new Folder("Documents");
        Folder pictures = new Folder("Pictures");
        Folder vacation = new Folder("Vacation");

        documents.add(file1);
        documents.add(file2);

        pictures.add(vacation);
        pictures.add(file5);

        vacation.add(file3);
        vacation.add(file4);

        root.add(documents);
        root.add(pictures);
        root.add(file6);

        root.display(0);
    }
}
