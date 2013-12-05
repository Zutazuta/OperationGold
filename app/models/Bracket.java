package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.ArrayList;



@Entity
public class Bracket extends Model
{
	@Id
	public int bracketID;
	public ArrayList<Round> roundList;
	
	private class Round {
		
		private String team1;
		private String team2;
		private boolean bTeam1Win;
		private boolean bStatus;
		private int topicID;
		private int matchNumber;
		
		public Round(String team1, String team2, boolean bStatus, int topicID, int matchNumber){
			this.team1 = team1;
			this.team2 = team2;
			this.bStatus = bStatus;
			this.topicID = topicID;
			this.matchNumber = matchNumber;
			this.bTeam1Win = false;	
		}
		
		public String getTeam1() {
			return team1;
		}

		public void setTeam1(String team1) {
			this.team1 = team1;
		}

		public String getTeam2() {
			return team2;
		}

		public void setTeam2(String team2) {
			this.team2 = team2;
		}

		public boolean isbTeam1Win() {
			return bTeam1Win;
		}

		public void setbTeam1Win(boolean bTeam1Win) {
			this.bTeam1Win = bTeam1Win;
		}

		public boolean isbStatus() {
			return bStatus;
		}

		public void setbStatus(boolean bStatus) {
			this.bStatus = bStatus;
		}

		public int getTopicID() {
			return topicID;
		}

		public void setTopicID(int topicID) {
			this.topicID = topicID;
		}

		public int getMatchNumber() {
			return matchNumber;
		}

		public void setMatchNumber(int matchNumber) {
			this.matchNumber = matchNumber;
		}
}
	
	
}