/**
 * CS 240: Data Structures and Algorithms I
 * Instructor: Dr. Fang Tang
 *
 * Programming Project #1
 *
 * This is a simple program called the Caesar Cipher. The Caesar Cipher shifts each character of the plaintext message by   
 * 
 */
package cpp.edu.cs.cs240.project1;

/**
 * This class represents all the fields and methods that are associated with the
 * Caesar Cipher.
 * 
 * @author Seungyun
 *
 */
public class TheCaesarCipher {

	/**
	 * This field represents all the alphabet letters.
	 */
	private final char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	/**
	 * This field represents a text that will be printed out.
	 */
	private String text = null;

	/**
	 * This field represents a shift value.
	 */
	private int shiftValue = 0;

	// String all = new String(alphabet);
	// S.toCharArray()

	// new String(A): create an object of class String from a character array A
	// S.toCharArray(): create a character array representation of string S

	/**
	 * This method returns the text field.
	 * 
	 * @return text, either a plain or cipher text
	 */
	public String getText() {

		return text;

	}

	/**
	 * This method sets the text.
	 * 
	 * @param text
	 *            text would be a plaintext or a ciphertext
	 */
	public void setText(String text) {

		this.text = text;

	}

	/**
	 * This method returns the value of shift value.
	 * 
	 * @return a value of shiftValue
	 */
	public int getShiftValue() {

		return shiftValue;

	}

	/**
	 * This method sets the value of shift value.
	 * 
	 * @param shiftValue
	 *            a shift value that the user desires
	 */
	public void setShiftValue(int shiftValue) {

		this.shiftValue = shiftValue;

	}

	/**
	 * This method represents encryption. It takes a plaintext as an input and a shift
	 * value from the user. Then, it encrypts the plaintext. Each character of the plaintext
	 * is shifted by "shift" places.
	 * 
	 * @param input
	 * @param shift
	 */
	public void encrypt(String input, int shift) {

		char[] temp = input.toCharArray();

		shiftValue = shift;

		for (int i = 0; i < temp.length; ++i) {

			for (int j = 0; j < alphabet.length; ++j) {

				if (temp[i] == alphabet[j]) {

					temp[i] = alphabet[j + shift];

				}

			}

		}

		text = new String(temp);

	}

	/**
	 * This method represents decryption. It decrypts the ciphertext.
	 */
	public void decrypt() {

		char[] temp = text.toCharArray();

		for (int i = 0; i < temp.length; ++i) {

			for (int j = 0; j < alphabet.length; ++j) {

				if (temp[i] == alphabet[j]) {

					temp[i] = alphabet[j - shiftValue];

				}

			}

		}

		text = new String(temp);

	}

}
