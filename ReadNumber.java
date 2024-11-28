package ocr;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.LinkedHashMap;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

import static ocr.FormatNumber.*;

// gets number from input file and returns an ArrayList String of the number
public class ReadNumber {
    private String inputLine = "";
    private ArrayList<String> inputLines = new ArrayList<String>();
//    private String[] codeDigits = FormatNumber.codeDigits;

    public static void main(String[] args) {
        CreateLinkedHashMap createLinkedHashMapInstance = new CreateLinkedHashMap();
        ReadNumber readNumber = new ReadNumber();

//    String input = args[0];
        readNumber.convertInputFileToObject("sample.txt", true, createLinkedHashMapInstance);
        readNumber.convertInputFileToObject("input.txt", false, createLinkedHashMapInstance);
    }

    public void convertInputFileToObject(String filename, boolean isTrainingData, CreateLinkedHashMap createLinkedHashMapInstance) {
        ReadNumber readNumber = new ReadNumber();
        ArrayList<String> inputLines = readNumber.inputLines;
        String inputLine = readNumber.inputLine;

        FormatNumber formatNumber = new FormatNumber();
        String[] codeDigits = formatNumber.getCodeDigits();


        try {

            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {

                inputLine = myReader.nextLine();
                inputLines.add(inputLine);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        formatNumber.inputSplitter(inputLines);


        if (isTrainingData) {
            createLinkedHashMapInstance.createLinkedHashMap(codeDigits);
        }
        LinkedHashMap<String, Integer> numbersMap = createLinkedHashMapInstance.getNumbersMap();
        ConvertNumber.convertNumberArrays(codeDigits, numbersMap);
    }
}
 
