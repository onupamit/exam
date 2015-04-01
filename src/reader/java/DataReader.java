package reader.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args){
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 * 
		 */
		String filePath = "/Users/shamimchy/Desktop/Filetxt.txt";
		FileReader file = null;
		BufferedReader br = null;
		
		try {
			
			file = new FileReader(filePath);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		br = new BufferedReader(file);
		
		String st = "";
		int i=0;
        String stringArray[] = new String[100];
		try {
			while((st = br.readLine())!=null){
				stringArray[i] =  st;
				System.out.println(st);
				i++;
				
			}
			System.out.println("\n *****Print From String Array**** \n ");
			for(int j = 0; j<stringArray.length; j++ ){
			System.out.println( stringArray[j]);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally{
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}


}
