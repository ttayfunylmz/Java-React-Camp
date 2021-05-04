package Abstracts;

import Entities.Campaign;

public interface ICampaignManagerService {
	
	void add(Campaign campaign);
	
	void remove(Campaign campaign);
	
	void update(Campaign campaign);

}
