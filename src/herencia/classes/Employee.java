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
		
	} //constructor Employee
    
//Métodos    
    public int timeToRetirement(){
        // time to retirement = min(60 - age, 40 - yearsWorked)
    	return Math.min((60-age),(40-yearsWorked));
     }//timeToRetirement

     public int vacationTimeLeft(){
         // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
    	 return (daysWorked/30)*(30-vacationDaysTaken);
     }//vacationTimeLeft

     public double calculateBonus(){
         // bonus = 2.2*salary
    	 return (2.2*salary);
     }//calculateBonus

//Getters and Setters
	public String getFirstName() {
		return firstName;
	} //getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getAge() {
		return age;
	}//getAge

	public void setAge(int age) {
		this.age = age;
	}//setAge

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	public int getRegistration() {
		return registration;
	}//getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}//getRegistration
	

     

} //class Employee