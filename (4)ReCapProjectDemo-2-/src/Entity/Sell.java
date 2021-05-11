package Entity;

public class Sell {
	private int id;
	private Game game;
	private User user;
	
	public Sell(int id, Game game, User user) {
		super();
		this.id = id;
		this.game = game;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
