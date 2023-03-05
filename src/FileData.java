import java.nio.file.Path;

public class FileData {
    private final String fileName;
    private final long fileSize;
    private final Path filePath;

    public FileData(String fileName, long fileSize, Path filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public Path getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return fileName;
    }
}
