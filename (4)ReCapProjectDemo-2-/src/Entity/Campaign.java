package Entity;

public class Campaign {
	private int id;
	private String campaignName;
	private String description;
	private int discount;
	
	
	public Campaign(int id, String campaignName, String description, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.description = description;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
