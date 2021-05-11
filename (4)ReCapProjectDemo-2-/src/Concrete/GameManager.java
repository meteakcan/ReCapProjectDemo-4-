package Concrete;

import Abstract.GameService;
import Entity.Campaign;
import Entity.Game;

public class GameManager implements GameService{

	public void addGame(Game game) {
		System.out.println("Oyun eklendi ! : " + game.getName());
		
	}

	public void deleteGame(Game game) {
		System.out.println("Oyun silindi ! : " + game.getName());
		
	}

	public void getGameDescription(Game game) {
		System.out.println(game.getName());
		System.out.println("Aciklama : " + game.getDescription());
		System.out.println("Fiyat : " + game.getPrice());
	}

	public void startGame(Game game) {
		if(game.isEnabled() == false)
		{
			System.out.println("Oyun devre disi birakilmistir.");
		}
		else
		{
			System.out.println(game.getName() + " oyunu baslatiliyor...");		
		}
	}

	@Override
	public void gamePriceWithDiscount(Game game, Campaign campaign) {
		if(campaign.getDiscount() > 0)
		{
			double basePrice = game.getPrice();
			int discount = campaign.getDiscount();
			game.setPrice(basePrice - (basePrice * discount / 100 ));
			
		}
	}

}
