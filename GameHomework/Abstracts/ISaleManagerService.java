package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface ISaleManagerService {
	
	//It's for non-campaign games.
	void sell(User user, Game game);
	
	//It's for campaign games.
	void sell(User user, Game game, Campaign campaign);

}
