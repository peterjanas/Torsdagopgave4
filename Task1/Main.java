public class Main{

	public static void main(String[] args){

		Team Team1 = new Team ("the boys");
		Team Team2 = new Team ("The Downbad");
		Team Team3 = new Team ("GIGATEAM");
		Team Team4 = new Team ("TSM");
		Team Team5 = new Team ("æøå");
		Team Team6 = new Team ("ja tak");
		Team1.setTeamRank(1);
		Team2.setTeamRank(2);
		Team3.setTeamRank(3);
		Team4.setTeamRank(4);
		Team5.setTeamRank(5);
		Team6.setTeamRank(6);

	System.out.println(Team1);
	System.out.println(Team2);
	System.out.println(Team3);
	System.out.println(Team4);
	System.out.println(Team5);
	System.out.println(Team6);
	}
}