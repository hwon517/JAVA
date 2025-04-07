import java.io.*;

public class MyFileWriter {
	public static void main(String[] args) {
		String fname = "src/test.data";
		
		// Create directories if they don't exist
		File file = new File(fname);
		file.getParentFile().mkdirs();

		try (
			FileWriter fw = new FileWriter(fname);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		) {
			String line;
			System.out.println("Enter text (press Ctrl+D to end):");
			while ((line = br.readLine()) != null) {
				fw.write(line);
				fw.write('\n');
			}
		} catch (IOException e) {
			System.err.println("An IOException was caught: " + e.getMessage());
		}
	}
}
