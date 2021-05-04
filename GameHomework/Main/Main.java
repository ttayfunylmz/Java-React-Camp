package Main;

import Adapters.MernisCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Tayfun", "Yılmaz", 2000, "00000000000");
		User user2 = new User(2, "Ebru", "Sayil", 2001, "00000000000");
		User user3 = new User(3, "Melih", "Sahtiyan", 2000, "00000000000");
		User user4 = new User(4, "Edvin", "Davulcu", 2001, "00000000000");
		
		Game game1 = new Game(1, "League of Legends", 950);
		Game game2 = new Game(2, "Valorant", 1350);
		
		
		Campaign campaign1 = new Campaign(1, "Spring Campaign", 15);
		Campaign campaign2 = new Campaign(2, "Autumn Campaign", 20);
		
		
		
		
		
		UserManager userManager = new UserManager(new MernisCheckService());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		userManager.remove(user4);
		userManager.update(user3);
		userManager.remove(user1); 
		
		System.out.println("-------------------------");
		
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game2);
		
		System.out.println("-------------------------");
		
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.remove(campaign1);
		campaignManager.update(campaign2);
		
		System.out.println("-------------------------");
		
		saleManager.sell(user1, game2);
		saleManager.sell(user3, game1, campaign2);
		saleManager.sell(user4, game1, campaign1);
		saleManager.sell(user2, game2, campaign2);
		saleManager.sell(user2, game1);
		

		
		
		

	}

}
