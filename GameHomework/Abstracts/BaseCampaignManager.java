package Abstracts;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignManagerService {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " named campaign is added.");
	}
	
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName() + " named campaign is removed.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " named campaign is updated.");
	}

}
