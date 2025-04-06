import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q11 {
	
	public static void main(String[] args) {
		String filePath = "text.txt";
		
		try {+
			processFile(filePath);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
	
	public static void processFile(String filePath) throws IOException {
		File file = new File(filePath);
		
		if (!file.exists()) {
			throw new IOException("File not found: " + filePath);
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Processing line: " + line);
			}
		}
	}
}
