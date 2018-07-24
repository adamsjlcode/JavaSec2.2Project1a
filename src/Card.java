/**
 * ---------------------------------------------------------------------------
 * File name: Card.java
 * Project name: Project1a
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Card Object 
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class Card
{
	
	Face face;	/** The face. */
	
	Suit suit;	/** The suit. */
	
	/**
	 * Instantiates a new card.
	 */
	public Card ( )
	{
		this.face = face.ACE;
		this.suit = suit.SPADES;
	}//End Card ()
	
	/**
	 * Instantiates a new card.
	 *
	 * @param n the n
	 */
	public Card (int n)
	{
		face = Face.values ( )[n % 13];
		suit = Suit.values ( )[n % 4];
	}//End Card (int)
	
	/**
	 * Instantiates a new card.
	 *
	 * @param existingCard the existing card
	 */
	public Card (Card existingCard)
	{
		face = existingCard.face;
		suit = existingCard.suit;
	}//End Card (Card)
	
	/**
	 * ToString method         
	 *
	 * <hr>
	 * Date created: Feb 23, 2017 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "The " + face + " of " + suit;
	}//End toString()
	
}//End Card
