import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class DesAndEnFiles {

    private static final String LINE = "C:/Projects/small_projects/encrypt_and_decrypt_files/names.txt";
    private final Decryptor decryptor;
    private final Encryptor encryptor;

    public DesAndEnFiles() {
        this.decryptor = new Decryptor();
        this.encryptor = new Encryptor();
    }

    public void files(boolean encrypt, boolean decrypt) {
        try {
            File file = new File(LINE);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            StringBuilder result = new StringBuilder();

            while (scanner.hasNext()) {
                if (encrypt) {
                    System.out.println("You encrypt this file");
                    result =  encryptor.encrypt(String.valueOf(sb.append(scanner.nextLine()).append("\n")));
                } else if (decrypt) {
                    System.out.println("You decrypt this file");
                    result = decryptor.decrypt(String.valueOf(sb.append(scanner.nextLine()).append("\n")));
                }
            }
            Formatter formatter = new Formatter(file);
            formatter.format(String.valueOf(result));
            formatter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
