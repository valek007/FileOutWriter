import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        reader.close();

        byte[] buffer = new byte[file1.available()];
        if (file1.available() > 0) {
            int count = file1.read(buffer);
            file2.write(buffer, 0, (count + 1) / 2);

            file3.write(buffer, (count + 1) / 2, count / 2);
        }
        file1.close();
        file2.close();
        file3.close();
    }
}