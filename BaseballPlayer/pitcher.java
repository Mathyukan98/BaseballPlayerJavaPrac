public class pitcher extends BaseballPlayer{
	double innings;
	double earnedRunAverage;
	
	//constructor
	pubilc pitcher(double innings,double earnedRunAverage,String sport,String team,String position,String firstName,String LastName,int atBats,int hits){
		super(atBats,hits,sport,team,position,firstName,LastName);
		this.innings=innings;
		this.earnedRunAverage=earnedRunAverage;
		
	}
	public double earnedRunAverage()
	{
		return((earnedRun/innings)*9.0);
	}
	pubilc String toString()
	{
		return super.toString()+",ERA:"+String.format("%.3f",averageGoalsAllowed());
	}
}