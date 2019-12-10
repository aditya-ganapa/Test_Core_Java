package InterfaceObject;
public interface IPlayerStatistics {
	public void displayPlayerStatistics();
}
abstract class Player {
	protected String name;
	protected String teamName;
	protected int noOfMatches;
	public Player(String name, String teamName, int noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
}
class CricketPlayer extends Player implements IPlayerStatistics {
	private int totalRunsScored;
	private int noOfWicketsTaken;
	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public void displayPlayerStatistics(){
		System.out.println("Player Details");
		System.out.println("Player name:"+name);
		System.out.println("Team name:"+teamName);
		System.out.println("No of matches:"+noOfMatches);
		System.out.println("Total runs scored:"+totalRunsScored);
		System.out.println("No of wickets taken:"+noOfWicketsTaken);
	}
}
class HockeyPlayer extends Player implements IPlayerStatistics {
	private String position;
	private int noOfGoals;
	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics(){
		System.out.println("Player Details");
		System.out.println("Player name:"+name);
		System.out.println("Team name:"+teamName);
		System.out.println("No of matches:"+noOfMatches);
		System.out.println("Position:"+position);
		System.out.println("No of goals taken:"+noOfGoals);
	}
}