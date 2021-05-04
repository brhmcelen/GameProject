package Classes;

import java.util.ArrayList;
import java.util.List;

import Entities.Player;
import interfaces.PlayerService;
import interfaces.PleyerValidationService;

public class PlayerManager implements PlayerService{
	
	
    private PleyerValidationService validationService;
	
	public PlayerManager(PleyerValidationService validationService) {
		this.validationService = validationService;
		
		
	}
	
	
	private List<Player> players = new ArrayList<Player>();
	

	@Override
	
	public void add(Player player) {
		
		if(validationService.isPlayerValid(player)) {
			players.add(player);
			System.out.println(player.getUserName() + " kullan�c� adl� oyuncu eklendi.");
		}else {
			System.out.println("Kullan�c� do�rulanmad�!");
		}
			
	}

	@Override
	public void remove(Player player) {
		players.removeIf(obj-> obj.getId() == player.getId());
		System.out.println(player.getUserName() + " kullan�c� adl� oyuncu silindi.");		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getUserName() + " kullan�c� adl� oyuncu g�ncellendi.");		
	}

	@Override
	public List<Player> getAll() {
		return this.players;
	}

}
