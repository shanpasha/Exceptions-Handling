package Com.Exceptions;

import java.io.File;
import java.io.FileOutputStream;

public class FileNotFoundException {
	public static void main(String[] args) throws java.io.FileNotFoundException {
		
//	when there is no .class file in that time File not found Exception will come
		
		
	
		
		
		String message="hi This is Java Class";
		
		File f=new File("message.txt");
		FileOutputStream file= new FileOutputStream(f);
		System.out.println(message);
		
		
		
	}

}
