import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void write(Object p, String title) {
        try (FileWriter writer = new FileWriter(new File(title + ".txt"), true)) {
            writer.write(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
