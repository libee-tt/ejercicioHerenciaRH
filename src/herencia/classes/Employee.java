package herencia.classes;

public class Employee {
	
	private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;
    
    
//    Constructor
    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
		///////////
		int timeToRetirement();
		int vacationTimeLeft();
		
	} //constructor Employee
    
//Metodos    
    public int timeToRetirement(){
        // time to retirement = min(60 - age, 40 - yearsWorked)
    	return ;
     }//timeToRetirement

     public int vacationTimeLeft(){
         // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
     }//vacationTimeLeft

     public int calculateBonus(){
         // bonus = 2.2*salary
     }//calculateBonus


} //class Employee
