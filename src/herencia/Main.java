package herencia;

import java.util.ArrayList;

import herencia.classes.SalesManager;
import herencia.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		
		/////crear Vendedores
		SalesRep jim = new SalesRep("Jim", "Halpert", 101, 35, 250, 7, 55000, 8, 150000);
        SalesRep dwight = new SalesRep("Dwight", "Schrute", 102, 40, 300, 10, 60000, 15, 200000);
        SalesRep pam = new SalesRep("Pam", "Beesly", 103, 32, 200, 5, 45000, 6, 100000);
        SalesRep stanley = new SalesRep("Stanley", "Hudson", 104, 55, 400, 20, 65000, 30, 180000);
        SalesRep phyllis = new SalesRep("Phyllis", "Vance", 105, 50, 350, 15, 58000, 20, 170000);

        ///crear Manager 
        SalesManager michael = new SalesManager("Michael", "Scott", 100, 45, 500, 25, 70000, 25, 300000);
        
        /////agregar vendedores a una lista
        ArrayList<SalesRep> salesReps = new ArrayList <>();
        salesReps.add(jim);
        salesReps.add(dwight);
        salesReps.add(pam);
        salesReps.add(phyllis);
        salesReps.add(stanley);
        
        ///agregar vendedores al team
        michael.addSalesRepToTeam(jim);
        michael.addSalesRepToTeam(dwight);
        michael.addSalesRepToTeam(pam);
        michael.addSalesRepToTeam(stanley);
        michael.addSalesRepToTeam(phyllis);
        
		
		///////imprimir info de salesReps
        for (SalesRep rep:salesReps) {
        	
        	System.out.println("Sales Rep: "+rep.getFirstName()+" "+rep.getLastName());
        	System.out.println("Time to Retirement: " + rep.timeToRetirement());
        	System.out.println("Vacation Time Left: " + rep.vacationTimeLeft());
        	System.out.println("Bonus: " + rep.calculateBonus());
        	System.out.println("Commission: " + rep.calculateCommission());
        	System.out.println("___________________________________________________");
        	
        }//for 
        

        
        //imprimir info manager
        System.out.println("SalesManager: "+michael.getFirstName()+" "+michael.getLastName());
    	System.out.println("Time to Retirement: " + michael.timeToRetirement());
    	System.out.println("Vacation Time Left: " + michael.vacationTimeLeft());
    	System.out.println("Bonus: " + michael.calculateBonus());
    	System.out.println("Commission: " + michael.calculateCommission());
    	System.out.println("___________________________________________________");
        
        
    }//main
}//class Main


//private String firstName;
//private String lastName;
//private int registration;
//private int age;
//private int daysWorked;
//private int vacationDaysTaken;
//private double salary;
//private int yearsWorked;