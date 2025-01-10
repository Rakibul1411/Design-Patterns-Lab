package solutions.codes;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", "This is file-1");
        File file2 = new File("file2.txt", "This is file-2");
        File file3 = new File("file3.txt", "This is file-3. Hello");

        Folder folder1 = new Folder("Folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.addComponent(file3);

        Folder rootFolder = new Folder("RootFolder");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        String keyword = "Hello";
        System.out.println("Searching for keyword '" + keyword + "':");
        boolean isFound = rootFolder.searchKey(keyword);
        System.out.println("Keyword: '" + keyword + "' found in the file system: " + isFound);

        if(file1.searchKey(keyword)) {
            System.out.println("Keyword: '" + keyword + "' found in the file system");
        }
        else{
            System.out.println("Keyword: '" + keyword + "' not found in the file system");
        }

    }
}
