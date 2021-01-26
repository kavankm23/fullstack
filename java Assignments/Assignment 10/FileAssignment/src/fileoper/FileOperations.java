package fileoper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.*;

public class FileOperations {
	public static void main(String[] args) throws Exception{
		
		// Convert all file information in lower case in target file 
		FileReader fr = new FileReader("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\File10.txt");
		FileWriter fw = new FileWriter("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\LowerCase.txt");
		int ch;
		while((ch=fr.read()) != -1) {	
			 if (Character.isUpperCase(ch))
				 fw.write( (int) Character.toLowerCase(ch) );
			 else
				 fw.write(ch);
		}

		fr.close();
		fw.close();
		System.out.println("Input file data converted to Lower Case in target file");
		
		
		// Convert all file information in upper case in target file. 
		FileReader fr1 = new FileReader("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\File10.txt");
		FileWriter fw1 = new FileWriter("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\UpperCase.txt");
		int ch1;
		while((ch1=fr1.read()) != -1) {	
			 if (Character.isLowerCase(ch1))
				 fw1.write( (int) Character.toUpperCase(ch1) );
			 else
				 fw1.write(ch);
		}

		fr1.close();
		fw1.close();
		System.out.println("Input file data converted to Upper Case in target file");
		
		
		// Convert all sentence first letter in upper case.
		FileReader fr2 = new FileReader("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\File10.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\FirstLetterUpper.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		
		String line = null;
		    System.out.println("Converting first letter of sentence to Upper Case in Target File");
		    if((line = br2.readLine()) != null){
		    	
			        fw2.write(line.substring(0, 1).toUpperCase()+line.substring(1));
		    }
		    else{
		    	 fw2.write(line.substring(0, 1).toUpperCase()+line.substring(1));
		    }
		    fw2.close();
		    br2.close();
		    fr2.close();
	
		    
		// Display number of character present in file. 
		FileReader fr3 = new FileReader("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\File10.txt");
		BufferedReader br3 = new BufferedReader(fr3);
		String line1;
		int count=0;
        	while ((line1 = br3.readLine()) !=null) {
        		String words[]=line1.split(" ");
        		for(String word:words)
          	        count=count+word.length();
		}
        br3.close();
		fr3.close();
		System.out.println("Number of characters present in file = "+count);
		
		
		// Display number of words present in file.
		FileReader fr4 = new FileReader("C:\\Users\\YASHWANTH\\Desktop\\Zensar\\Zensar Java FS Training\\Java\\JAVA ASSIGNMENTS\\File10.txt");
		BufferedReader br4 = new BufferedReader(fr4);
		String line2;
		int count1=0;
        	while ((line2 = br4.readLine()) !=null) {
          		String words[]=line2.split(" ");
          		count1=count1+words.length;
		}
        fr4.close();
		System.out.println("Number of Words Present in File = "+count1);
	}
}