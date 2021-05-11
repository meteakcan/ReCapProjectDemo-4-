package Abstract;

import Entity.Campaign;
import Entity.Game;

public interface GameService {
	
	public void addGame(Game game);
	public void deleteGame(Game game);
	public void getGameDescription(Game game);
	public void startGame(Game game);
	public void gamePriceWithDiscount(Game game,Campaign campaign);
}

