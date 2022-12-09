public class Main {
 
  public static void main(String[] args) {
  
    WordTool sentenceOne = new WordTool();
    String text = "Today, I learn something new.";

    System.out.println("Analysing the text: \n" + text);
    System.out.println("Total number of words: " + sentenceOne.wordCount(text));
    System.out.println("The number of characters with spaces: " + sentenceOne.symbolCount(text, true));
    System.out.println("The number of characters with spaces: " + sentenceOne.symbolCount(text, false));
  }
}
