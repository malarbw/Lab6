import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		System.out.println("Welcome to the Pig Latin Translator");
		while (cont.equalsIgnoreCase("y")) {

			// Get word to translate from the user.
			System.out.print("Please enter a word to translate: ");
			String word = scan.nextLine();
			word = word.toLowerCase(); // convert to lower case so that all
										// tests below can be in lower case

			// Determine whether the first character in word is a vowel
			char firstChar = word.charAt(0); // First index is 0
			String vowels = "aeiou";

			// If firstChar is a vowel then indexOf will return at which index
			// it appears in the String vowels, otherwise it returns -1
			int vowelIndex = vowels.indexOf(firstChar);
			boolean firstIsVowel = (vowelIndex >= 0);

			System.out.print("\n\"" + word + "\" in Pig Latin is ");
			if (firstIsVowel) {
				System.out.println("\"" + word + "-way\"");
			} else { // first character is consonant, assuming it is a letter
				String restOfWord = word.substring(1); // all but first character
				System.out.println("\"" + restOfWord + "-" + firstChar + "ay\"");
			}
			System.out.println("Do you want to continue? y/n: ");
			cont = scan.nextLine();
		}
		System.out.println("Thanks for using the Pig Latin Translator. Goodbye.");
	}
}
