import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {



        Encryptor encryptor = new Encryptor();
        encryptor.encrypt("Domeczek");
        Decryptor decryptor = new Decryptor();
        decryptor.decrypt("Grphf}hn");
    }
}
