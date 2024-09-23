package herencia.classes;

public class SalesRep extends Employee {
	
	private double salesMade;
	
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade=salesMade;
	}//Constructor SalesRep

	
	 public double calculateCommission(){
	      // comission = 0.1 * salesMade
		 return 0.1*salesMade;
	   }//calculateComission


//getter de salesMade para acceder en manager
	public double getSalesMade() {
		return salesMade;
	}


	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}


//añadiendo método to string 
	@Override
	public String toString() {
		return 
				"Sales Rep: "+ getFirstName()+" "+getLastName()+
				"\nSales Made: $"+ String.format("%.0f",  getSalesMade())+
				"\nTime to Retirement: "+ timeToRetirement()+
				"\nVacation Time Left: "+vacationTimeLeft()+
				"\nBonus: "+ String.format("%.0f",calculateBonus())+
				"\nCommission: $"+String.format("%.0f",calculateCommission());
	} //toString

	
	
	
	 
	 

}// class SalesRep