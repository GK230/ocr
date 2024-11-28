package ocr;
import java.awt.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ConvertNumber {
    //    looks up the three character strings (codeDigits) in linked hash map (numbersMap) and returns integers
    public static void convertNumberArrays(String[] codeDigits, LinkedHashMap<String, Integer> numbersMap) {

        for (int i = 0; i < codeDigits.length; i++) {
            System.out.println(numbersMap.get(codeDigits[i]));
            System.out.println(numbersMap.containsKey(codeDigits[i]));
        }
    }
}



