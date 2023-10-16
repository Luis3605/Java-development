import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;




public class BedtimeStory {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to select a story/file
            System.out.print("Enter the name of the story/file: ");
            String fileName = scanner.nextLine();

            // Read the selected story and print with line numbers
            readAndPrintStoryWithLineNumbers(fileName);

            // Close the scanner
            scanner.close();
        }

        private static void readAndPrintStoryWithLineNumbers(String fileName) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int lineNumber = 1;

                // Read each line and print with line numbers
                while ((line = reader.readLine()) != null) {
                    System.out.printf("%d. %s\n", lineNumber, line);
                    lineNumber++;
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }

