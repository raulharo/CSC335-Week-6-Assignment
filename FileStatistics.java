import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics {
    public static void main(String[] args) {
        Path file = Paths.get("/root/sandbox/FileStatistics.java");
        // Write your code here
        try {
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

        System.out.println("File name is " + file.getFileName());
        System.out.println("Folder name is " + file.getName(1));
        System.out.println("File's size is " + attr.size());
        System.out.println("File's creation time is " + attr.creationTime());
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}
