package solutions.codes;

public class File implements FileSystemComponent{
    private final String fileName;
    private final String fileContent;

    public File(String fileName, String fileContent) {
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    @Override
    public boolean searchKey(String keyword) {
        if (this.fileContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in file: " + this.fileName);
            return true;
        }
        return false;
    }
}
