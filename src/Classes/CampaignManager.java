package Classes;

import java.util.ArrayList;
import java.util.List;

import Entities.Campaign;
import interfaces.CampaignService;

public class CampaignManager implements CampaignService{
	
	List<Campaign> campaigns = new ArrayList<Campaign>();
	

	@Override
	public void add(Campaign campaign) {

		campaigns.add(campaign);
		System.out.println("Kampanya Eklendi...");
		
		
	}

	@Override
	public void remove(Campaign campaign) {
		
		campaigns.removeIf(obj->obj.getId() == campaign.getId());
		
		
	    System.out.println("Kampanya silindi.");

		
	
		
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar�yla g�ncellendi...");
		
	}

	@Override
	public List<Campaign> getAll() {
		return this.campaigns;
		
	}
	
	

}
