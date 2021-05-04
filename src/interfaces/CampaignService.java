package interfaces;
import java.util.List;
import Entities.Campaign;




public interface CampaignService {
	
	void add(Campaign campaign);
	void remove(Campaign campaign);
	void update(Campaign campaign);
	
	List<Campaign> getAll();
	
	
	
	

}
