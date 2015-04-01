package employee.java;

public abstract class EmployeeAbstract implements Employee{
	String employeeName  = new String();
	static String jobTittle[] = {"Test_Enginear","Selenium_Tester","QA_peformance"};
	int startSalary[] = {120000,90000, 65000};
	int employeedID;
  EmployeeAbstract(){
		
	}
  EmployeeAbstract(int id){
		employeedID = id;
			
		}
		
   EmployeeAbstract(String name, int id){
	employeeName  = name;
	employeedID = id;
		
	}
   public int calculateSalary(String jobTitle, int yearInJob ) {
	   int yearsInJob = yearInJob;
	   int salary = 0;
	   for(int i=0; i< 3; i++)
	   {
	   if(jobTitle == jobTittle[i]){
		    salary = (int) (startSalary[i]+startSalary[i] * yearsInJob*.11);
		   
	   }
	   else  if(jobTitle==jobTittle[i] ){
		   salary = (int) (startSalary[i]+startSalary[i] * yearsInJob*.11);
		   
	   }
	   if(jobTitle==jobTittle[i]){
		    salary = (int) (startSalary[i]+startSalary[i] * yearsInJob*.11);
		   
	   }
	   }
			
			return salary;
		
	}
	
}
