public class Encryptor {

    public void encrypt(String example) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < example.length(); i++) {
            result.append((char)(example.charAt(i) + 3));
        }
        System.out.println(result);
    }
}
