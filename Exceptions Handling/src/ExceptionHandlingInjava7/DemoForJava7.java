package ExceptionHandlingInjava7;

import java.io.File;import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoForJava7 {
	public static void main(String[] args)  {
		


	File a=new File("C:\\Users\\new\\Music\\Employee.java");
	
	try (FileInputStream inputFile=new FileInputStream(a);){
		
		int fi=0;
		while((fi=inputFile.read())!=-1) {
			
			System.out.print
			((char)fi);
			
			
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}