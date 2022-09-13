package Com.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IoException {
public static void main(String[] args) throws FileNotFoundException {
	
	String message="Welcom java programming language";
	
	File file =new File("messt");
	
	FileOutputStream f=new FileOutputStream(file);
	
	
}

	
	
}
