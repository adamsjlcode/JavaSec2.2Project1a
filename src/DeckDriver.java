/**
 * ---------------------------------------------------------------------------
 * File name: DeckDriver.java
 * Project name: Project1a
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Testing driver for Deck Class
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class DeckDriver
{

	/**
	 * Main method         
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017
	 * 
	 * <hr>.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{
		Deck one = new Deck();		/** the First Deck. */
		Deck copy = new Deck(one);	/** the First Deck Copied. */
		System.out.println ("First Deck: \n" + one.toString ( ));
		one.shuffle (one.deck);
		System.out.println ("Shuffled: \n" + one.toString ( ));
		System.out.println ("Second Deck: \n" + copy.toString ( ));
		System.out.println (copy.dealAHand (7));
		System.out.println (copy.dealAHand (7));
	}//End main (String[])

}//End DeckDriver
