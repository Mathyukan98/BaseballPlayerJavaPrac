public class BaseballPlayer extends player{
	//variable
	int atBats;
	int hits;
	
	//constructor
	public BaseballPlayer(String sport,String team,String position,String firstName,String LastName,int atBats,int hits){
		super(sport,team,position,firstName,LastName);
		this.atBats=atBats;
		this.hits=hits;	
	}
	
	//method
	public double battingAverage(){
		return((double)hits/atBats);	
	}
	public String toString(){
		return super.toString()+", position:"+super.getPos()+",Batting AVG"+String.format("%.3f",battingAverage());
		
	}
}