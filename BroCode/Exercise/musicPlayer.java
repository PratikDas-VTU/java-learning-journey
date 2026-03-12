import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class musicPlayer {

    public static void main(String[] args) {

        String filePath = "BroCode\\Exercise\\By Myself - The Grey Room _ Clark Sims.wav";

        File file = new File(filePath);
        Scanner scanner = new Scanner(System.in);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("\n========== MUSIC PLAYER ==========");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {

                    case "P":
                        clip.start();
                        System.out.println("▶ Playing music...");
                        break;

                    case "S":
                        clip.stop();
                        System.out.println("⏸ Music stopped.");
                        break;

                    case "R":
                        clip.setMicrosecondPosition(0);
                        System.out.println("⏮ Music reset.");
                        break;

                    case "Q":
                        clip.close();
                        System.out.println("❌ Music player closed.");
                        break;

                    default:
                        System.out.println("⚠ Invalid option!");
                }
            }

        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio resource unavailable.");
        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}