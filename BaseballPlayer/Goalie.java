public class Goalie extends SoccerPlayer{
	int goalsAllowed;
	
	public Goalie(String sport,String team,String position,String firstName,String LastName,int minutes,int goals,int goalsAllowed;){
		super(minutes,goals,sport,team,position,firstName,LastName);
		this.goalsAllowed=goalsAllowed;
		
	}
	public double averageGoalsAllowed(){
		return ((goalsAllowed/super.minutes)*90.0)
	}
	public StringtoString(){
		return super.toString()+",AGA:"+String.format("%.3f",averageGoalsAllowed());
	}
	
}