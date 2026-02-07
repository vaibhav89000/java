import java.util.ArrayList;
import java.util.List;


interface FileSystemItem {
    String getName();
}

class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> subFolders;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
    }

    public void addSubFolder(FileSystemItem folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(FileSystemItem folder) {
        subFolders.remove(folder);
    }

    public List<FileSystemItem> getSubFolders() {
        return subFolders;
    }

    public String getName() {
        return name;
    }
}

public class Composite {
    public static void main(String[] args) {
        Folder directory = new Folder("root");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Folder subDirectory = new Folder("subdir");
        File file3 = new File("file3.txt"); 
        subDirectory.addSubFolder(file3);
        directory.addSubFolder(file1);
        directory.addSubFolder(file2);
        directory.addSubFolder(subDirectory);   

        System.out.println("Directory: " + directory.getName());           

        for (FileSystemItem item : directory.getSubFolders()) {
            System.out.println(" - " + item.getName());
                if (item instanceof Folder) {
                    Folder subDir = (Folder) item;
                    for (FileSystemItem subItem : subDir.getSubFolders()) {
                        System.out.println("   - " + subItem.getName());
                    }
                }   
        }   
}
}