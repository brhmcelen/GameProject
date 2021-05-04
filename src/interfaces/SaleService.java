package interfaces;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SaleService {
	
	
	void sale(Game game, Player player);
	
	void sale(Game game, Player player,Campaign campaign);
	
	

}
