package Classes;


import java.util.Date;

import Entities.Player;
import Utilities.BusinessRules;
import interfaces.PleyerValidationService;

public class EDevletValidationService implements PleyerValidationService{

	@Override
	public boolean isPlayerValid(Player player) {
		
		boolean validationResult = BusinessRules.Run(
				isFullNameValid(player.getFirstName(), player.getLastName()),
				isBirthDateValid(player.getDateOfBirth()),
				isTcknValid(player.getTckn()));
		
		
		
		
		
		if(!validationResult) return false;
		return true;
		
		
		
		
	}
	private boolean isFullNameValid(String firstName,String lastName) {
		if(firstName.length() < 3 || lastName.length() < 3) return false;
		return true;
	}
	
	@SuppressWarnings("deprecation")
	private boolean isBirthDateValid(Date birthDate) {
		if(birthDate.getYear() >= 2004) return false;
		return true;
	}
	private boolean isTcknValid(String tckn) {
		if(tckn.length() != 11) return false;
		return true;
	}
	
	
	
	

}
