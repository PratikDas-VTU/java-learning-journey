package Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writeFiles {
    public static void main(String[] args) {
        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriterf = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filepath = "\"J:\\\\A Journey Begins\\\\Programming Languages\\\\JAVA\\\\YT\\\\java-learning-journey\\\\BroCode\\\\Files\\\\test.txt\"";

        String textContent = "I like coding";

        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(textContent);
            System.out.println("File has been written !");

        }catch(FileNotFoundException e){
            System.out.println("Could not locate file exception");

        }
        catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }
}
