import java.io.File;
import java.util.Scanner;

public class DesAndEnFiles {

    String line = "C:/Projects/small_projects/encrypt_and_decrypt_files/names.txt";

    public void files() {
        try {
            Scanner scanner = new Scanner(new File(line));
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNext()) {
                sb.append(scanner.nextLine()).append("\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
