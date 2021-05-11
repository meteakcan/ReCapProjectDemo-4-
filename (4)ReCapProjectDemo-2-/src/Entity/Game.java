package Entity;

public class Game {
	private int id;
	private String name;
	private String description;
	private double price;
	private boolean enabled;
	
	public Game(int id, String name, String description, double price,boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.enabled = enabled;
	}

	public Game() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
