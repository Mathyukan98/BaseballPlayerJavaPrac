public class SoccerPlayer extends player{
	int minutes;
	int goals;
	
	public SoccerPlayer(String sport,String team,String position,String firstName,String LastName,int minutes,int goals){
			super(sport,team,position,firstName,LastName);
			this.minutes=minutes;
			this.goals=goals;
		
	}
	public double goalsPerGame(){
	return ((goals/minutes)*90.0);
	}
	public String toString() {
	return super.toString()+", position:"+super.getPos()+",Batting AVG"+String.format("%.3f",goalsPerGame());
	}

	


}