import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileIn = new FileInputStream(reader.readLine());
        FileOutputStream fileOut1 = new FileOutputStream(reader.readLine());
        FileOutputStream fileOut2 = new FileOutputStream(reader.readLine());

        reader.close();

        byte[] list1 = new byte[fileIn.available()];
        fileIn.read(list1);

        int num = list1.length;
        int half = 0;

        if((list1.length)%2==0) half = list1.length/2;
        else half = list1.length/2+1;

        fileOut1.write(list1, 0, half);
        fileOut2.write(list1,half,half-1);

        fileIn.close();
        fileOut1.close();
        fileOut2.close();
    }
}