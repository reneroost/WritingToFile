package ee.reneroost;


import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        writeToFile("Delfi");

    }

    public static void writeToFile(String newsSiteName) {
        try (
                FileWriter fileWriter = new FileWriter(new File("/home/rene/Dokumendid/ScrapedNews/Delfi/", generateFileName(newsSiteName)), true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                ) {
            printWriter.println("Tere maailm");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String generateFileName(String newsSiteName) {
        return newsSiteName + "_" + LocalDate.now() + ".txt";
    }

}