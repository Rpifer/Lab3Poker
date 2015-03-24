package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {

		//	Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}
		}
		
		//	Set the instance variable
		cards = MakingDeck;
		
		//	Shuffle the cards
		Collections.shuffle(cards);
		
	}
	//Takes in put in the form of two, three, four.etc
	public Deck(String wild) {
		wild = wild.toUpperCase();
		int rank;
		switch(wild){
		case "TWO": rank = 0; break;
		case "THREE": rank = 1; break;
		case "FOUR": rank = 2; break;
		case "FIVE": rank = 3; break;
		case "SIX": rank = 4; break;
		case "SEVEN": rank = 5; break;
		case "EIGHT": rank = 6; break;
		case "NINE": rank = 7; break;
		case "TEN": rank = 8; break;
		case "JACK": rank = 9; break;
		case "QUEEN": rank = 10; break;
		case "KING": rank = 11; break;
		case "ACE": rank = 12; break;
		default: rank = 99;
		}
		//	Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {			
			for (short j = 0; j <= 12; j++) {
				if(rank == j){
					i = 5;
					j = 13;
				}
				eSuit SuitValue = eSuit.values()[i];
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}
		}
		
		//	Set the instance variable
		cards = MakingDeck;
		
		//	Shuffle the cards
		Collections.shuffle(cards);
		
	}
	
	public Deck(int jokers){
		Deck deck = new Deck();
		for (int i = 0; i < jokers;i++){
			Card jokerCard = new Card(eSuit.JOKER,eRank.JOKER);
			deck.cards.add(jokerCard);
		}
		cards = deck.cards;
		Collections.shuffle(this.cards);
	}
	
	public Card drawFromDeck() {
		// Removes the first card from the deck and return the card
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {
		// Returns the total number of cards still in the deck
		return cards.size();
	}
}