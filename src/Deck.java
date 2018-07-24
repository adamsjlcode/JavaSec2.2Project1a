import java.util.Random;

/**
 * ---------------------------------------------------------------------------
 * File name: Deck.java
 * Project name: Project1a
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 * Deck of cards object
 *
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>
 * @author Justin Adams
 */
public class Deck
{
	
	
	Card[] deck;	/** The deck. */

	int nextCard;	/** The next card. */
	
	/**
	 * Instantiates a new deck.
	 */
	public Deck ( )
	{
		deck = new Card[52];
		for(int i = 0 ; i < 52 ; i++)
		{
			deck[i] = new Card(i);
		}
		nextCard = 0;
	}//End Deck ( ) 
	
	/**
	 * Instantiates a new deck.
	 *
	 * @param existingDeck the existing deck
	 */
	public Deck (Deck existingDeck)
	{
		deck = new Card[52];
		for(int i = 0 ; i < 52 ; i++)
		{
			deck[i] = existingDeck.deck[i];
		}
		nextCard = 0;
	}//End Deck (Deck)
	
	/**
	 * Shuffle.
	 *
	 * @param deck the deck
	 */
	public void shuffle (Card[] deck)
	{
		Random rdm = new Random();
		int iNewCard;
		for(int i = 51 ; i > 0 ; i--)
		{
			iNewCard = rdm.nextInt(i);
			Card temp = deck[iNewCard];
			deck[iNewCard] = deck[i];
			deck[i] = temp;
		}
		nextCard = 0;
		
	}//End shuffle (Card[])
	
	/**
	 * Deal A card.
	 *
	 * @return the card
	 */
	public Card dealACard ( )
	{
		try 
		{
			return deck[nextCard];
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println ("Error");
		}
		
		finally
		{
			nextCard++;
		}
		return null;
	}//End dealACard ( )
	
	/**
	 * Deal A hand.
	 *
	 * @param handSize the hand size
	 * @return the string
	 */
	public String dealAHand (int handSize)
	{
		String hand = "Hand: \n";
		for (int i = 0; i < handSize; i++ )
		{
			hand += "Card " + (i+1) + " "+ deck[nextCard].toString ( )+"\n";
			dealACard();
		}
		return hand;
	}//End dealAHand (int)
	
	/**
	 * toString method         
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
		String temp = "";
		for (int i = 0; i < deck.length; i++ )
		{
			temp  +=  ((i+1) + " " + deck[i] + "\n");
		}
		return temp;
	}//End toString ( )
	
}//End Deck
