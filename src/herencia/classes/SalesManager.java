package herencia.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	
	//equipo ventas
	private HashMap<Integer, SalesRep>team;

	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		
		this.team = new HashMap<>(); //////prueba-team
	}//SalesManager

// crear team
	public void addSalesRepToTeam(SalesRep salesRep) {
		team.put(salesRep.getRegistration(), salesRep);
	}//addSalesRepToTeam
	
//	getter para el team
		
	public HashMap<Integer, SalesRep> getTeam() {
		return team;
	}//getTeam

	public void setTeam(HashMap<Integer, SalesRep> team) {
		this.team = team;
	}

	//	métodos 
	public double calculateCommission() {
        double salesTeam = 0; 
        
        for (SalesRep rep : team.values()) {
        	salesTeam += rep.getSalesMade();
        }//for 
        
        return 0.03 * salesTeam;
    } //calculateCommission

	@Override
	public String toString() {
		return 
				"Sales Manager: "+ getFirstName()+" "+getLastName()+
				"\nTime to Retirement: "+ timeToRetirement()+
				"\nVacation Time Left: "+vacationTimeLeft()+
				"\nBonus: "+ String.format("\"%.0f",calculateBonus())+
				"\nCommission for sales made - team: $"+calculateCommission();
	}//toString
	
//toString 
	

}//class SalesManager

