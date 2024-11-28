package ocr;
import java.util.LinkedHashMap;

public class CreateLinkedHashMap {
    private final LinkedHashMap<String, Integer> numbersMap = new LinkedHashMap<>();

    public void createLinkedHashMap(String[] codeDigits) {

        // create an array of numbers from 1 to 9 for the values to a hashmap
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // add array of strings and corresponding values of numbers to hashmap
        for (int i = 0; i < codeDigits.length; i++) {
            numbersMap.put(codeDigits[i], numbers[i]);
        }
    }
    public LinkedHashMap<String, Integer> getNumbersMap() {
        return numbersMap;
    }
}


