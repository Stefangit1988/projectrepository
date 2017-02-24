package blackJackTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Blackjack {

private int numberOfDecks;
private ArrayList<String> deck = new ArrayList<String>();
private HashMap<String,Integer> cardValues = new HashMap<String, Integer>();
// reserved for hashmap linking to images
private String[] cardsPerSuit = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
private int[] cardValue = {11,2,3,4,5,6,7,8,9,10,10,10,10};
private String[] cardSuits = {"of Spades", "of Hearts", "of Clubs", "of Diamonds"};


// Returns an Arraylist for the finished decks.
public void initializeDeck(String[] cards, String[]suits, int numberOfDecks ){
	
	for(int deckNumber = 0; deckNumber < numberOfDecks; deckNumber++){
	for(String i: cards){
		for(String j: suits){
			deck.add(i + " " + j);
	}
	}
	}
	
}
// method for creating a hasmap with values per card RETURNS NULLPOINTER
public void assignCardValue(){
	for(int i = 0 ; i < cardsPerSuit.length;i++){
		cardValues.put(cardsPerSuit[i],cardValue[i]);
		}
	}

//method for asking if the player want to continue



// constructor that makes a new deck on initialization
public Blackjack(int numberOfDecks) {
	super();
	this.numberOfDecks = numberOfDecks;
	initializeDeck(cardsPerSuit,cardSuits, numberOfDecks);
	assignCardValue();
}
//no args constructor

public Blackjack() {
	super();
	// TODO Auto-generated constructor stub
}
//method for pressing enter to continue
public void PressEnter(){
	System.out.println("Press Enter to continue...");
   Scanner scan = new Scanner(System.in);
   scan.nextLine();
}

//getters and setters.


public int getNumberOfDecks() {return numberOfDecks;}

public ArrayList<String> getDeck() {return deck;}

public void setDeck(ArrayList<String> deck) {this.deck = deck;}

public void setNumberOfDecks(int numberOfDecks) {this.numberOfDecks = numberOfDecks;}


public String[] getCardsPerSuit() {return cardsPerSuit;}


public void setCardsPerSuit(String[] cardsPerSuit) {this.cardsPerSuit = cardsPerSuit;}


public String[] getCardSuits() {return cardSuits;}


public void setCardSuits(String[] cardSuits) {this.cardSuits = cardSuits;}

public HashMap<String, Integer> getCardValues() {return cardValues;}

public void setCardValues(HashMap<String, Integer> cardValues) {this.cardValues = cardValues;}


}
