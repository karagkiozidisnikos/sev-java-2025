package gr.aueb.sev.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.UUID;

/**
 * Small console utility to copy a file to a new uniquely-named file.
 * <p>
 * The application reads a file name from the user, generates a new file
 * name by prefixing a random UUID, copies the file to the new location and
 * prints basic metadata about the original and new file.
 * </p>
 * <p>
 * This class is an educational example and does not perform advanced
 * validation or support complex path handling. It uses the platform default
 * character encoding and standard Java NIO file operations.
 * </p>
 */
public class CopyFileApp {
    static Scanner scanner = new Scanner(System.in);
    static final String basePath = "C:\\ΣΕΒ\\";
    static final String outPath = "C:\\ΣΕΒ\\";

    public static void main(String[] args) {
        try{
        System.out.println("Please insert file name");
        String inputName = getInputFileName();

        String newFileName = generateNewFileName(inputName, outPath);

        String inputPath = basePath + inputName;
        copyFile(inputPath, newFileName);

        String fileExtenstion = extractExtenstion(inputName);

        printMetadata(inputName, newFileName, fileExtenstion);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Reads a file name from standard input.
     *
     * @return the line entered by the user as the input file name
     */
    public static String getInputFileName(){
        return scanner.nextLine().trim();
    }

    /**
     * Generates a new file name located under the specified output path.
     * <p>
     * The new name contains a randomly generated UUID to make it unique and
     * then appends the original file name.
     * </p>
     * @param originalName the original file name (may include relative path)
     * @param outPath the directory or path prefix where the new file will be created
     * @return the full destination path for the new file
     */
    public static String generateNewFileName(String originalName, String outPath){
        UUID uuid = UUID.randomUUID();
        return outPath + uuid.toString().replace(":", "_") + originalName;
    }

    /**
     * Copies a file from sourcePath to destinationPath.
     *
     * @param sourcePath the path to the source file
     * @param destinationPath the path to the destination file
     * @throws IOException if an I/O error occurs during copying
     */
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Extracts the file extension from a filename.
     * <p>
     * For example, "photo.jpg" -> "jpg". If there is no extension an
     * empty string is returned.
     * </p>
     * @param filename the file name to examine
     * @return the extension without the dot, or an empty string if none
     */
    public static String extractExtenstion(String filename){
        String extension = "";
        int lastIndexOfDot = filename.lastIndexOf('.');
        if (lastIndexOfDot != -1){
            extension = filename.substring(lastIndexOfDot + 1);
        }
        return extension;
    }

    /**
     * Prints basic metadata about the original and copied file.
     *
     * @param originalPath the original file path provided by the user
     * @param newFilePath the full path of the newly created file
     * @param fileExtension the extracted file extension (may be empty)
     */
    public static void printMetadata(String originalPath, String newFilePath, String fileExtension) {
        System.out.println("Original file path: " + originalPath);
        System.out.println("New file path: " + newFilePath);
        System.out.println("File extension: " + fileExtension);
    }


}
