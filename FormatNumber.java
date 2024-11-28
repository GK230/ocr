package ocr;
import java.util.ArrayList;
import java.util.List;

// transforms ArrayList String number into hashmap of individual numbers
public class FormatNumber {

  private String[] splitlineOne;
  private String[] splitlineTwo;
  private String[] splitlineThree;
  private String[] codeDigits = new String[10];

  public void inputSplitter(ArrayList<String> inputLines) {

    // gets each element of the ArrayList number and puts it in a separate string
    String firstline = inputLines.get(0);
    String secondline = inputLines.get(1);
    String thirdline = inputLines.get(2);

    String[] splitlineOne = getParts(firstline).toArray(new String[0]);
    String[] splitlineTwo = getParts(secondline).toArray(new String[0]);
    String[] splitlineThree = getParts(thirdline).toArray(new String[0]);

    // create an array of three character strings representing each digit in the input
    for (int i = 0; i < codeDigits.length; i++) {
      for (int j = 0; j <= i; j++) {
        codeDigits[i] = splitlineOne[j] + splitlineTwo[j] + splitlineThree[j];
        System.out.println(codeDigits[i]);
      }
    }
  }
  public String[] getSplitlineOne() {
    return splitlineOne;
  }

  public String[] getSplitlineTwo() {
    return splitlineTwo;
  }

  public String[] getSplitlineThree() {
    return splitlineThree;
  }

  public String[] getCodeDigits() {
    return codeDigits;
  }

  private List<String> getParts(String string) {
    List<String> parts = new ArrayList<String>();
    int len = string.length();
    for (int i=0; i<len; i+=3)
    {
      parts.add(string.substring(i, Math.min(len, i + 3)));
    }
    return parts;
  }
}

    



  


     
  

      
      
      

      
      

    
  
    
