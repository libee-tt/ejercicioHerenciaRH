package herencia;

import java.util.ArrayList;

import herencia.classes.SalesManager;
import herencia.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		
		/////crear Vendedores
		//                     Names,registration,age,daysWorked,vacationDaysTaken, salary,yearsWorked,salesMade
		SalesRep jim = new SalesRep("Jim", "Halpert", 101, 36, 250, 7, 55000, 8, 150000);
        SalesRep dwight = new SalesRep("Dwight", "Schrute", 102, 44, 300, 10, 60000, 15, 200000);
        SalesRep pam = new SalesRep("Pam", "Beesly", 103, 35, 200, 5, 45000, 6, 100000);
        SalesRep stanley = new SalesRep("Stanley", "Hudson", 104, 60, 400, 20, 65000, 30, 180000);
        SalesRep phyllis = new SalesRep("Phyllis", "Vance", 105, 47, 350, 15, 58000, 20, 170000);

        ///crear Manager 
        SalesManager michael = new SalesManager("Michael", "Scott", 100, 49, 500, 25, 70000, 25, 300000);
        
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
        	
        	System.out.println(rep.toString());
        	System.out.println("___________________________________________________");
        	
        }//for 
        
        
        //imprimir info manager
        System.out.println(michael.toString());
    	System.out.println("___________________________________________________");
        
        
    }//main
}//class Main








