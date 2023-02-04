public class player{
	String sport;
	String team;
	String position;
	String firstName;
	String LastName;
	
	//constructor
	public  player(String sport,String team,String position,String firstName,String LastName){
	this.sport=sport;
	this.team=team;
	this.position=position;
	this.firstName=firstName;
	this.LastName=LastName;
			
	}
	//return details
	public String toString(){
			return(firstName+" "+LastName+","+sport);
	}
	//return position
	public  String getPos(){
		return this.position;
	}	
}