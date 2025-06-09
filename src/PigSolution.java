/**
 * 
 * ONLY LOOK AT THIS FILE IF YOU ARE ASSIGNED
 * TO PRESENT (BE THE INTERVIEWER FOR) PIG.
 * 
 * 
 * Guide is way at the bottom.
 */
























































 public class PigSolution {

  /*
   * Create a method that takes a string consisting of one or more 
   * all-lowercase words separated by spaces. It should return a new string 
   * converted to "pig Latin," where each word has its first letter moved to 
   * the back and the letters "ay" are added to the end of the word. However, 
   * words starting with a vowel (a, e, i, o, or u) should not be altered.
   *
   * Examples:
   *
   * pigLatin("something")  should return "omethingsay"
   * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
   * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
   * pigLatin("y")  should return "yay"
   * pigLatin("e")   should return "e"
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, pigLatin("something"), "omethingsay");
    assertEqual(2, pigLatin("awesome"), "awesome");
    assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
    assertEqual(4, pigLatin("y"), "yay");
    assertEqual(5, pigLatin("e"), "e");
  }

  public static String pigLatin(String sentence) {
    // Split the sentence into words
    String[] words = sentence.split(" ");
    // Initialize the result as an empty string
    String result = "";

    // Loop through each word in the sentence
    for (String word : words) {
      // Convert the word to Pig Latin and add it to the result
      result += pigLatinSingleWord(word);
      result += " ";
    }

    // Remove the extra space at the end
    result = result.substring(0, result.length() - 1);

    return result;
  }

  // Helper method to convert a single word to Pig Latin
  // If the word starts with a vowel, it remains unchanged
  // If the word starts with a consonant, the first letter is moved to the end followed by "ay"
  private static String pigLatinSingleWord(String word) {
    // Check if the first letter is a vowel
    if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
      return word; // Return the word unchanged if it starts with a vowel
    }
    
    // If it starts with a consonant, move the first letter to the end and add "ay"

    // Get the first letter
    char firstLetter = word.charAt(0);
    // Remove the first letter from the word
    word = word.substring(1);
    // Move the old first letter to the end
    word = word + firstLetter; 

    // Add "ay" to the end
    return word + "ay";
  }

  /*
   * ***NOTES TO INTERVIEWER***
   *
   * ---------Answers to clarifying questions----------
   * Q: What should I do if the string is empty or null?
   * A: You do not need to worry about this case. You can assume the input will 
   *    be a string with at least one letter in it.
   *
   * Q: How should I handle capital letters?
   * A: You can assume the input will not have any capital letters.
   *
   * Q: What should I do with punctuation, numbers, etc.?
   * A: You can assume the input will include only letters and spaces.
   *
   * Q: What should I do if there's extra spaces?
   * A: You can assume there will be exactly one space in between words and no 
   *    extra spaces at the beginning or end of the string.
   * --------------------------------------------------
   *
   * ---------Hints for struggling candidates----------
   *
   *  - If your candidate struggles with an initial algorithm, encourage them 
   *    to walk through an example and describe how they would do it using only 
   *    pen and paper.
   *
   *  - If they're having trouble determining how to handle multiple words, 
   *    encourage them to first write code to solve the case where there's only 
   *    a single word in the string.
   *
   *  - If they're having trouble determining how to check if a word starts with 
   *    a vowel, encourage them to ignore the vowel condition at first, and 
   *    alter all words.
   *
   *  - Remember that Strings should have double quotes and chars should have single quotes
   *
   *  - If your candidate is struggling to convert a single word, ask them to do 
   *    it step by step. Ask them the following questions. If they don't know the Java
   *    syntax for it, tell them they can search for it online.
   *    - How do you get the first letter of a string?
   *    - How do you remove the first letter from a string?
   *    - How do you add letters to the end of a string?
   *
   *  - If it looks like test cases should be passing but they aren't, double check 
   *    whether there is an extra space at the end of their output.
   * -------------------------------------------------
   *
   * Extra notes:
   * There are more ways to do this! In particular, using a StringBuilder is much more efficient than
   * repeatedly adding strings together. Learn more about StringBuilder here:
   *   https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
   * 
   * There are a lot more comments on this guide than are normally needed. This is just to
   * help you as the interviewer as you are beginning, but in your actual project/work code
   * you should not have so many redundant comments.
   */

  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
    if (!expected.equals(actual)) {
      System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
    } else {
      System.out.println("Test " + testNumber + " passed!");
    }
  }
}

