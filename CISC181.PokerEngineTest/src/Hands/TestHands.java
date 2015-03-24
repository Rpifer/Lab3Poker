package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.NaturalRoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.NaturalRoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestJokerRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be jrf:",eHandStrength.JokerRoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFiveOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be FOAK:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}

	@Test
	public final void TestFourOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be FOAK:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFullHouse1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Fh:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFullHouse2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Fh:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
	
		assertEquals("Should be Flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraight1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be STRAIGHT:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraight2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be STRAIGHT:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be TOAK:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be TOAK:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKindJoker2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
				
		assertTrue("Should be true:",h.getJoker());
	}
	@Test
	public final void TestTwoPair1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be TP:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestPair1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestHighCard1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be HC:",eHandStrength.HighCard.getHandStrength(),h.getHandStrength());		
	}	
	@Test
	public final void TestHighCard2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be HC:",12,h.getHighPairStrength());		
	}	
}
