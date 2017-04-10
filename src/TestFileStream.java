import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		try (
				// Create an output stream to the file
				FileOutputStream fos = new FileOutputStream("temp.dat");) {
			for (int i = 1; i < 11; i++) {
				fos.write(i);
			}
		}
		try (
				// Create an input stream to the file
				FileInputStream fis = new FileInputStream(new File("temp.dat"));) {
			int value;
			while ((value = fis.read()) != -1)
				System.out.print(value + " ");
		}
	}
}
