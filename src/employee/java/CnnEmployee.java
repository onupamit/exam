/* Developer Name: Shamim A. Chowdhury
 * Company Name: Curious Information System
 * Project Name: Human_Resource_DB(Version 0.2)
 * N.B: Use your Own Risk. We are not responsible for anything.
 */

package employee.java;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class CnnEmployee {

	private static Object string;

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(student.java) package is given as an outline,you need to elaborate
	 * more to design a professional software that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	
	public static void main(String[] args) throws IOException {
		System.out.println("Company Name: " + EmployeeInfo.companyName);
		 System.out.print("Department Name : Human Resouce");
		
		 Date date1 = Calendar.getInstance().getTime();
		 System.out.println("\nDate "+ date1 + " \n");
		 
		 EmployeeInfo employeeInfo = new  EmployeeInfo();
		 
		
		/*
		 System.out.println(EmployeeInfo.degree[0]);
		 System.out.println(EmployeeInfo.degree[1]);
		 System.out.println(EmployeeInfo.degree[2]);
		 employeeInfo.benefitLayout();
		 
		 Random rn = new Random();
		 int answer = rn.nextInt(10) + 1;
		 System.out.println(answer);
		 
		/*
		 insert();
		 delete();
		 print();
		 */
		 
		
		 char choice = 0;
			while( choice != 'q'){
			do{
			System.out.println("\n Human Resouce: Employee database");
		    System.out.println("Select Your Choice \n "
		    		+ " 1 for Insert Record \n,"
		    		+ "2. for Check Recored\n"
		    		+ " q for exit \n ");

		    choice = (char) System.in.read();
		  
		    } while (choice < '1' | choice > '2' & choice != 'q');
			
			switch(choice){
			case '1':
				 System.out.println("--------Input  Employee   Record -------------------");
				 for(int i=0; i< 1;i++){
			    System.out.print("Entering Record for Employee ID #  " + (1001+i )+ " \n");	 
				 System.out.print("Please Enter Name: ");
				 Scanner  sc =  new Scanner(System.in);
				 String name  = sc.next();
				 System.out.println("Entered Name : " + ( employeeInfo.employeeNameRecord[i] =  name ));
				
				 employeeInfo.employeeIDRecord[i] =  1001+i ;
				 
				 System.out.print("Enter Hiring Date: format dd/mm/yyyy ");
				 Scanner  scHd =  new Scanner(System.in);
				 String date  = scHd.nextLine();				
				 employeeInfo.employeeHireDate[i] =  date;
				 System.out.println("\n Employee Hiring Date : "+ employeeInfo.hiringDate( date));
				 
				 
				 
				
				 
				 Random raNumber = new Random();
				 int performance = raNumber.nextInt(10) + 1;
				 
				 System.out.println("Employee Performance: "+(employeeInfo.employeePerformance[i] =  performance));
				 
				 System.out.print("Enter Job Tittle ");
				 Scanner  scJBT =  new Scanner(System.in);
				 String jobTittle = scJBT.nextLine();				
				 employeeInfo.employeejobTittle[i] =  jobTittle;
				 System.out.println("\n Employee JobTitel: "+ employeeInfo.jobTittle[i]);
				 
				 employeeInfo.employeeSalary[i] = employeeInfo.calculateSalary(employeeInfo.jobTittle[i],performance );
				 
				 System.out.println("\n Employe Salary : "+ employeeInfo.calculateSalary(employeeInfo.jobTittle[i],performance ) + " \n");
				 
				 employeeInfo.employeeBonus[i] = employeeInfo.calculateEmployeBonus(employeeInfo.employeeSalary[i], performance);
				System.out.println("\n EmployeBonus : "+ employeeInfo.calculateEmployeBonus(employeeInfo.employeeSalary[i], performance) + " \n");	
				
				EmployeeInfo.employeePension[i] = employeeInfo.calculateEmployePension( employeeInfo.employeeSalary[i], 3);
				 System.out.println("\n EmployePension : "+ employeeInfo.calculateEmployePension( employeeInfo.employeeSalary[i], 3) + " \n");
				 
				 System.out.println("\n ----------  \n");
				 }  
				   
				 break;
			case '2':
				 System.out.println("---------Check an Employee Record ----------------------");
				 for(int i=0; i< 3;i++){
					 System.out.println("name "+" "+" ID "+"  "+" Hiring Date"+" "+"Performance"+" "+"JobTittle"+" "+"Salary"+"  "+"Bonus"+"  "+"Pension"+" "+" Employee Benefit" );
					 System.out.print(employeeInfo.employeeNameRecord[i]+"   " );
					 System.out.print(employeeInfo.employeeIDRecord[i] +"   " );
					 System.out.print(employeeInfo.employeeHireDate[i]+"   ");
					 System.out.print(employeeInfo.employeePerformance[i]+"   ");
					 System.out.print(employeeInfo.employeejobTittle[i]+"   ") ; 
					 System.out.print(employeeInfo.employeeSalary[i]+"   ");
					 System.out.print(employeeInfo.employeeBonus[i]+"    ");
					 System.out.print(EmployeeInfo.employeePension[i]+"   ");
					 employeeInfo.benefitLayout();
					 System.out.println("\n ----------  ");
				 }
				
				 break;
			
		    default 	:
		    	break;
			  
			}
		  }	
			System.out.print("You have exited from program");
		}
	 }


