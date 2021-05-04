package GameProject;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Classes.CampaignManager;
import Classes.EDevletValidationService;
import Classes.GameManager;
import Classes.PlayerManager;
import Classes.SaleManager;

import java.util.Date;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import interfaces.CampaignService;
import interfaces.GameService;
import interfaces.PlayerService;
import interfaces.SaleService;

public class Main {

	public static void main(String[] args) {
		
		
		
		Game game = new Game(1,"Metin 2 ",50);
		Game game2 = new Game(2,"BattleField",100);
		
		Campaign campaign = new Campaign(1,"Öğrencilere özel %10 indirim",10);
		
		Player player1 = new Player(1,"brhmcelen","İbrahim","Çelen",  new Date (1997,2,1),"12345678901");
		
		 Player player2 = new Player(2,"engindemirog","Engin","Demiroð", new Date (2005,6,28),"5555555555");
		 
		 
		 
		 PlayerService playerService = new PlayerManager(new EDevletValidationService());
	        playerService.add(player1);
	        playerService.add(player2);
	        
	        GameService gameService = new GameManager();
	        gameService.add(game);
	        gameService.add(game2);
	        gameService.remove(game2);
	        
	        CampaignService campaignService = new CampaignManager();
	        campaignService.add(campaign);
	        
	        SaleService saleService = new SaleManager();
	        saleService.sale(game, player1);
	        saleService.sale(game, player1,campaign);
		}

	
	}
	        
	        
		
		
		
		




