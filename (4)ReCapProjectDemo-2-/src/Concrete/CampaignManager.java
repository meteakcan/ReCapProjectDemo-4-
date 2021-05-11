package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi! : " + campaign.getCampaignName());
		System.out.println(campaign.getDescription());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Guncellendi! : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Silindi! : " + campaign.getCampaignName());		
	}


}
