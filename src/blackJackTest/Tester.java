package blackJackTest;

public class Tester {

	
	public static void main(String[] args){
		
		Blackjack test = new Blackjack(1);
		
		PlayerHand player = new PlayerHand();
		BankHand bank = new BankHand();
		System.out.println(test.getCardValues());
		player.drawCard(test.getDeck());
		player.drawCard(test.getDeck());
		player.drawCard(test.getDeck());
		bank.drawCard(test.getDeck());
		bank.drawCard(test.getDeck());
		bank.drawCard(test.getDeck());
		bank.calculateValue(test.getCardValues());
		player.calculateValue(test.getCardValues());
		System.out.println(player.getHandContent());
		System.out.println(player.getHandValue());
		test.PressEnter();
		System.out.println(bank.getHandContent());
		System.out.println(bank.getHandValue());
		System.out.println(test.getDeck());
		
	}
	
}
