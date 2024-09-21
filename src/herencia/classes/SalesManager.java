package herencia.classes;

import java.util.ArrayList;

public class SalesManager extends SalesRep{
	
	//equipo ventas
	private ArrayList<SalesRep>team;

	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		
		this.team = new ArrayList<>(); //////prueba-team
	}//SalesManager

// crear team
	public void addSalesRepToTeam(SalesRep rep) {
		team.add(rep);
	}//addSalesRepToTeam
	
	
//	métodos 
	public double calculateCommission() {
        double salesTeam = 0; 
        
        for (SalesRep rep : team) {
        	salesTeam += rep.getSalesMade();
        }//for 
        
        return 0.03 * salesTeam;
    } //calculateCommission

	@Override
	public String toString() {
		return 
				"Sales Manager : "+ getFirstName()+" "+getLastName()+
				"\n Time to Retirement: "+ timeToRetirement()+
				"\n Vacation Time Left: "+vacationTimeLeft()+
				"\n Bonus: "+ calculateBonus()+
				"\n Commission for sales made - team: $"+calculateCommission();
	}//toString
	
//toString 
	

}//class SalesManager

