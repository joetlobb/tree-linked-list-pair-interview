/**
 * 
 * ONLY LOOK AT THIS FILE IF YOU ARE ASSIGNED
 * TO PRESENT (BE THE INTERVIEWER FOR) SPONGE.
 * 
 * 
 * Guide is way at the bottom.
 */






























































public class SpongeSolution {

  /*
   * Create a method that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("E"), "e");
    assertEqual(5, spongeCase("e"), "e");
  }

  public static String spongeCase(String sentence) {
    // Split the sentence into words
    String[] words = sentence.split(" ");
    // Initialize the result as an empty string
    String result = "";

    // Loop through each word in the sentence
    for (String word : words) {
      // Convert the word to sponge case and add it to the result
      result += spongeSingleWord(word);
      result += " ";
    }

    // Remove the extra space at the end
    result = result.substring(0, result.length() - 1);

    return result;
  }

  // Helper method to convert a single word to sponge case
  // The word starts with a lowercase letter, and alternates between
  // upper and lower case for each following letter.
  private static String spongeSingleWord(String word) {
    String newWord = "";
    // Toggle this variable to alternate between lower and upper case
    boolean lower = true;

    // Loop through each letter in the word
    for (char letter : word.toCharArray()) {
      if (lower) {
        // Add the lowercase version of the letter
        newWord += Character.toLowerCase(letter);
      } else {
        // Add the uppercase version of the letter
        newWord += Character.toUpperCase(letter);
      }
      // Flip the toggle
      lower = !lower;
    }

    return newWord;
  }

  /*
   * ***NOTES TO INTERVIEWER***
   *
   * ---------Answers to clarifying questions----------
   * Q: What should I do if the input is empty or null?
   * A: You do not need to worry about this case. You can assume the input will 
   *    be a string with at least one letter in it.
   *
   * Q: What should I do with punctuation, numbers, etc.?
   * A: You can assume the input will include only letters and spaces. They will
   *    all be within the extended ASCII block. However, accented characters
   *    should remain accented.
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
   *  - If they're having trouble determining how to loop over every character in a String,
   *    encourage them to look up how to do that online.
   *
   *  - If they're having trouble determining how to convert a single character to upper 
   *    or lower case, encourage them to look up how to do that online. Note that
   *    it's different to convert a String to upper case vs a single character.
   *
   *  - If your candidate is struggling with test case #3, remind them that the 
   *    question states that every word starts with a lowercase letter.
   * 
   *  - If it looks like test cases should be passing but they aren't, double check 
   *    whether there is an extra space at the end of their output.
   * -------------------------------------------------
   *
   * Extra notes:
   * There are more ways to do this! Using a StringBuilder would make it more efficient when 
   * working with large strings. Learn more about StringBuilder here:
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

