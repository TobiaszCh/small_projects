package notes;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesApp {
    private final static String PATH = "C:/Projects/small_projects/tasks_to_mentor/src/main/java/notes/";
    private final List<String> notes;
    private final Scanner scanner;
    private final DateTimeFormatter dateTimeFormatter;


    public NotesApp() {
        this.notes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
    }

    public void writerToFile() {
        System.out.println("You can write your notes. If you want save click Enter. If " +
                "you want to break click space");
        while (true) {
            String write = scanner.nextLine();
            if(write.equals(" ")) {
                break;
            }
            notes.add(write);
        }
        String localDate = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(localDate);
        try {
            Path path = Path.of( PATH + localDate + ".txt");
            FileWriter fileWriter = new FileWriter(path.toFile());
            for (String note: notes) {
                fileWriter.write(note + "\n");
            }
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Something is wrong");
        }
    }
}
