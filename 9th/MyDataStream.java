import java.io.*;

public class MyDataStream {
    public static void main(String[] args) {
        String fname = "src/data.txt";

        // Create directories if they don't exist
        File file = new File(fname);
        file.getParentFile().mkdirs();

        try (
            FileOutputStream fos = new FileOutputStream(fname);
            DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeUTF("데이터가 잘 들어가나요?\n");
            dos.writeInt(2385);
            dos.writeDouble(34.567);
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        }
    }
}
