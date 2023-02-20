public class Decryptor {

    public StringBuilder decrypt(String example) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < example.length(); i++) {
            result.append((char)(example.charAt(i) + 1));
        }
        return result;
    }
}
