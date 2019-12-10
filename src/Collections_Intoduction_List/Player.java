package Collections_Intoduction_List;
import java.util.ArrayList;
public class Player {
	private String name,country,skill;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public String toString() {
		return String.format("%-15s%-15s%-15s",name,country,skill);
	}
}
class PlayerBO {
	void displayAllPlayerDetails(ArrayList<Player> playerList){
		System.out.println("Player Details");
		for (Player player : playerList) 
			System.out.println(player);
	}
}