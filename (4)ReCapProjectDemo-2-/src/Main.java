import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SellManager;
import Concrete.UserManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Sell;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SellManager sellManager = new SellManager();
		
		User user1 = new User(1,"Mete","Akcan",2002,"123456789100");
		userManager.register(user1);
//Kimligi 11 karakterden az verdigimiz icin asagidaki karakterin eklenmesi mumkun olamayacak.
		User user2 = new User(2,"Mete","Akcan",2002,"123");		
		userManager.register(user2);
		
		userManager.updateUser(user1);
		userManager.deleteUser(user1);

		System.out.println("------------------------------------------------------");

		Campaign campaign1 = new Campaign(1, "Yaz Kampanyasi!", "Bu oyunlar %50 indirime girmistir...", 50);
		
		System.out.println("------------------------------------------------------");
		Game game1 = new Game();
		game1.setId(1); 
		game1.setName("GTA San Andreas"); 
		game1.setDescription("Yillar once daha fazla para kazanmak "
				+ "icin Liberty City'e giden Carl Johnson,annesinin olum haberini aldiktan sonra tekrar San Andreas'a doner ve abisiyle beraber"
				+ "tekrar kendi mahalle cetesini gelistirmeye calisir.");
		game1.setPrice(10);
		game1.setEnabled(true);
		
		gameManager.addGame(game1);
		gameManager.gamePriceWithDiscount(game1, campaign1); //Bu oyun fiyatini verilen kampanyaya gore ayarlar(Simdilik dandik bir sey oldu ama neyse....)
		
		gameManager.startGame(game1);
		gameManager.getGameDescription(game1);
		game1.setEnabled(false);
		gameManager.startGame(game1);
		gameManager.deleteGame(game1);
		System.out.println("------------------------------------------------------");
		
		Sell sell1 = new Sell(1,game1,user1);
		sellManager.buy(sell1);
		
	}

}
