public class Team 
{

private String teamName;
private int teamRank;
private String playerName;

public Team (String teamName)
	{
	this.teamName = teamName;
	//this.teamRank = teamRank;
	//this.playerName = playerName;
	}	

public void setTeamRank(int teamRank)
	{
this.teamRank = teamRank;
	} 

public String toString(){
		return "Hold: " + teamName + ": " + teamRank;

	}


}