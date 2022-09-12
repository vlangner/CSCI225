/**
 * 
 */

/**
 * @author vlangner
 *
 * This class shows how to implement a for loop to output a nice-looking rectangle of dollar signs using the math modulo method: %
 */
public class HowToForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a for loop to output 100 $ signs
		for (int i = 1; i <= 20; i++) {
			
			// System.out.println("The " + i + "th dollar sign is $");
			
			// output 20 dollar signs in a line
			System.out.print("$$$$$");
			if(i % 4 == 0) { // when i is a multiple of 4, output an empty line
				System.out.println();
			}
			
			
		}
		
	}

}
