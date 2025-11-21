package gr.aueb.sev.ch9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utility for converting a CSV-like locations file into a formatted output file.
 * <p>
 * The program reads an input file where the first line contains comma-separated
 * headers and subsequent lines contain comma-separated values. Each input line
 * is parsed into a map of header->value and then formatted into a simple
 * textual representation (e.g. { header: 'value', ... },) which is written to
 * the output file.
 * </p>
 * <p>
 * This is a small I/O-focused utility intended for demonstration and
 * educational use. It performs basic validation (file exists, non-empty) and
 * uses plain text parsing (splitting on commas) so it is not suitable for
 * production CSVs with quoted fields or embedded commas.
 * </p>
 */
public class LocationsFile {
    public static void main(String[] args) {
        Path inputPath = Path.of("C:\\ΣΕΒ\\IdeaProjects\\SevOpa\\src\\locations.txt");
        Path outputPath = Path.of("C:\\ΣΕΒ\\IdeaProjects\\SevOpa\\src\\outputlocations.txt");

        try {
            convert(inputPath, outputPath);
            System.out.println("Μετατροπή ολοκληρώθηκε!");
        } catch (IOException e) {
            System.out.println("Σφάλμα: " + e.getMessage());
        }

    }

    /**
     * Reads all lines from the given input path.
     *
     * @param inputPath the path to the input file
     * @return a list of lines read from the file
     * @throws IOException if the file does not exist or cannot be read
     */
    public static List<String> readAllLines(Path inputPath) throws IOException {
        if (!Files.exists(inputPath)) {
            throw new IOException((LocalDateTime.now() + " File not found: " + inputPath.toString()));
        }
        return Files.readAllLines(inputPath); // given method that reads all lines of a file
    }

    /**
     * Parses the header line into an array of normalized header names.
     * <p>
     * Normalization trims whitespace and converts header names to lower case.
     * </p>
     * @param headerLine the header line (comma separated)
     * @return an array of normalized header names
     */
    public static String[] parseHeader(String headerLine){
        String[] rawHeaders = headerLine.split(","); // Split the headers string to a string table
        String[] headers = new String[rawHeaders.length]; // new String array to format the headers

        for (int i = 0; i < rawHeaders.length; i++){
            headers[i] = rawHeaders[i].trim().toLowerCase();
        }

        return headers;
    }

    /**
     * Parses a single CSV line into a map from header to value.
     * <p>
     * If a line has fewer values than headers, missing values are stored as
     * empty strings. Extra values are ignored.
     * </p>
     * @param line the input CSV line
     * @param headers the array of header names to map values to
     * @return a map where each header is associated with the corresponding value
     */
    public static Map<String, String> parseLineToMap(String line, String[] headers) {
        String[] values = line.split(","); // Split the values to an array

        Map<String, String> record = new HashMap<>(); // Map class

        for (int i = 0; i < headers.length; i++){
            String value = "";

            if (i < values.length){
                value = values[i].trim();
            }

            record.put(headers[i], value); // location, Athens
        }
        return record;
    }

    /**
     * Formats a record map into a human-readable line.
     * <p>
     * Numeric values are written without surrounding quotes; non-numeric values
     * are wrapped in single quotes. The output line ends with a comma to make
     * it easy to combine multiple lines in a list-like structure.
     * </p>
     * @param record the map of header->value
     * @param headers the headers that determine the order of fields
     * @return a formatted string representation of the record
     */
    public static String formatRecord(Map<String, String> record, String[] headers){
        StringBuilder sb = new StringBuilder(); // Sb for each line
        sb.append("{ ");

        for (int i = 0; i < headers.length; i++ ){
            String key = headers[i];
            String value = record.get(key);

            sb.append(key).append(": ");

            if (isNumeric(value)){ // if numeric no '
                sb.append(value);
            } else {
                sb.append("'").append(value).append("'");
            }

            if (i < headers.length - 1){
                sb.append(", ");
            }
        }

        sb.append(" },");

        return sb.toString();
    }

    /**
     * Returns true if the provided string can be parsed as a number.
     *
     * @param str the string to test
     * @return true when str represents a valid number, false otherwise
     */
    public static boolean isNumeric(String str){
        if (str == null || str.isEmpty()) return false;

        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Writes the formatted lines to the output path. Ensures parent directories exist.
     *
     * @param outputPath the target file path
     * @param formattedLines the lines to write
     * @throws IOException if an I/O error occurs while creating directories or writing the file
     */
    public static void writeOutputFile(Path outputPath, List<String> formattedLines) throws IOException{
        if (outputPath.getParent() != null){
            Files.createDirectories(outputPath.getParent());
        }

        List<String> linesToWrite = new ArrayList<>(formattedLines);

        Files.write(outputPath, linesToWrite);
    }

    /**
     * Converts the input file into the formatted output file.
     * <p>
     * Reads all lines from the input file, parses the first line as headers
     * and converts each subsequent non-empty line into a formatted record.
     * The resulting lines are written to the output path.
     * </p>
     * @param inputPath the file to read from
     * @param outputPath the file to write the formatted output to
     * @throws IOException on I/O problems (missing file, empty file, write errors)
     */
    public static void convert(Path inputPath, Path outputPath) throws IOException{
        List<String> allLines = readAllLines(inputPath);

        if (allLines.isEmpty()){
            throw new IOException("File is empty");
        }

        String headerLine = allLines.get(0);
        String[] headers = parseHeader(headerLine);

        List<String> formattedLines = new ArrayList<>(); // Class list of Strings

        for (int i = 1; i < allLines.size(); i++) { // Start with the second line, headers have been dealt with
            String line = allLines.get(i);

            if (line.trim().isEmpty()) continue;

            Map<String, String> rec = parseLineToMap(line, headers);

            String formatted = formatRecord(rec, headers);

            formattedLines.add(formatted);
        }

        writeOutputFile(outputPath, formattedLines);

    }
}
