import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Q10 {
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No Path Found");
            return;
        }
        
        String filePath = args[0];
        
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    
    public static void readFile(String filePath) throws FileNotFoundException, FileReadPermissionException, IOException {
        File file = new File(filePath);
        
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        
        if (!file.canRead()) {
            throw new FileReadPermissionException("Cannot read the file due to permission issues: " + filePath);
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filePath, e);
        }
    }
}
