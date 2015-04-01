package employee.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract{

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to CnnEmployee class to apply all the fields and attributes.
	 * 
	 * Important: YOU MUST USE the 
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 */

		/*
		 * declare few static and final fields and some non-static fields
		 */
		static String companyName = "Curious Information System";
		static final double baseSalary = 65000;
		
		String employeeNameRecord[]= new String[10];
		int employeeIDRecord[]= new int[10];
		String employeeHireDate[]= new String[10];
		int employeePerformance[]= new int[10];
		String employeejobTittle[] = new String[10]; 
		int employeeSalary[] = new int [10]; 
		double employeeBonus[] = new double [10]; 
	    static int  employeePension[] = new int[10]; 
		
		
		String benefit[] = {"Medical","Dental","401K","1 Month Vacation","Salary Raised based on Performance","TA/DA Allowance"   };
		static String degree[] = {"BS","BA","GED"};
		String eduQualification="";
		String assignDepartment = "";
		int experience = 0;
		int languagePreficiency = 0;
		
		public int employeeId;
	//	String employeeName;
		
		
		
		/*
		 * You must implement the logic for below 2 methods and 
		 * following 2 methods are prototype as well for other methods need to be design,
		 * as you will come up with the new ideas.
		 */
		
		/*
		 * you must have multiple constructor.
		 * Must implement below constructor.
		 */
		public EmployeeInfo(){
						
		}
		public EmployeeInfo(int employeeId){
			super(employeeId);
			employeeId = employeeId;
			
		}
	    public EmployeeInfo(String name, int employeeId){
	    	super( name,employeeId );
	    	employeeName =  name;
	    	employeeId = employeeId;
	    	
			
		}
		
		/*
		 * This methods should calculate Employee bonus based on salary and performance.
		 * Then it will return the total yearly bonus. So you need to implement the logic.
		 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
		 * You can set arbitrary number for performance.
		 * So you probably need to send 2 arguments.
		 * 
		 */
		public static double calculateEmployeBonus(int salary ,int perforIndex){
			int performance = perforIndex;
            double bonus = 0;
			if(performance > 8 ){
				bonus = (bonus + (salary *.10));
			//	System.out.print("Bonus is : "+ bonus );
			}
			else if(performance > 5){
				bonus = (bonus + (salary * .08));
			//	System.out.print("Bonus is : "+ bonus );
			}
			else if (performance < 5){
				bonus = (bonus + (salary * .05));
			//	System.out.print("Bonus is : "+ bonus );
			}
			
			
			return bonus ;
		}
		
		/*
		 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
		 * Then it will return the total pension. So you need to implement the logic.
		 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
		 * So you probably need to send 2 arguments.
		 * 
		 */
		public static int calculateEmployePension( double salary, int yeasInJob){
			int pension = 0;
			if (yeasInJob< 2){
				pension = (int)(pension+salary * .05);
				
			}
			else if (yeasInJob < 3){
				pension = (int)( pension+ salary * .10);
				
			}
			else if (yeasInJob < 5){
				pension = (int)( pension+ salary * .15);
				
			}
			else if (yeasInJob < 8){
				pension = (int)( pension+ salary * .20);
				
			}
			else if (yeasInJob < 10){
				pension = (int)( pension+ salary * .25);
				
			}
			
			return pension;
		}
		@Override
		public int employeeId() {
		//	employeeId = employeeId;
			return employeeId;
		}
		@Override
		public String employeeName() {
			return employeeName;
		}
		@Override
		public void assignDepartment() {
			if(((eduQualification == degree[0])&&(experience >=3))&&(languagePreficiency  >5)){
				assignDepartment = jobTittle[0];
			}
			if(((eduQualification == degree[2])||(languagePreficiency >5))&(experience >=3)){
				assignDepartment = jobTittle[1];
			}
			if(((eduQualification == degree[3])||(languagePreficiency <5 ))&(experience > 1)){
				assignDepartment = jobTittle[2];
			}
			
			
		}
		
		@Override
		public void benefitLayout() {
			
		for(int i=0; i<benefit.length; i++){
			System.out.print("  " + benefit[i]);
		}
	
		}

       public String hiringDate(String hireDateParam){
			Date d = null; 
		      String hireDate =  hireDateParam;
		      //  Date now = new Date();
		     //   Scanner sc = new Scanner(System.in);  
		      //  System.out.print("PleaseEnter Date, (Format 'MM/DD/YYYY') : ");  
		     //   String ind = sc.nextLine();  
		             
		        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		 
		try {
			    d = new Date(); 
		         d=df.parse(hireDate);
		      
		      }
		      catch(ParseException e) {
		         System.out.println("Follow Date Format, otherwise today's date will be entered : " + hireDate);
		      }
		 
		      DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		  
		      
		      String s3 = df3.format(d);
		    
		      
		   //   System.out.println("The entered date is: " + s3);
		   
			
			
			
			return s3;
		}
	}
