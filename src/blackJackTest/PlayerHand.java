package blackJackTest;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerHand extends BlackjackHand{
	private ArrayList<String> handContent = new ArrayList<String>();
	private int handValue = 0;
	
	// method for checking the hand for win conditions
	public void winCheck(BlackjackHand hand){
	if(handValue == 21){
		System.out.println("You are have blackjack, you win\n Try again?\n Press \" yes \" to continue and \"no\" to stop playing.");
		playerContinue();
	}else if(handValue > 21){
		System.out.println("You are bust, you lose\n Try again?\n Press \" yes \" to continue and \"no\" to stop playing.");
	}else{
		System.out.println("");
	}
	}
	
	public void playerContinue(){
		
		Scanner scan = new Scanner(System.in);
		if(scan.nextLine().equalsIgnoreCase("yes")){
			// start again
		}else if(scan.nextLine().equalsIgnoreCase("no")){
			// terminate program
		} else{
			System.out.println("You have to enter either \" yes \" or \"no \" ");
		}
	}
	
	//getters and setters
	

	
	
	
}
