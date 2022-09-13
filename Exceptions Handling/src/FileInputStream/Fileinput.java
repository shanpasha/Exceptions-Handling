package FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinput {
	public static void main(String[] args) throws IOException {
		try {
		FileInputStream file=new FileInputStream(new File("G:\\s\\FileCreation.txt"));
		int i=0;
		//System.out.println(file.read());
		while((i=file.read())!=-1) {
			System.out.print((char)i);
			System.out.println(i);
		}
		}catch(FileNotFoundException ss) {
			System.out.println("FileInputStream");
		
		}
		}
		
	}
	


