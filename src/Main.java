import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Jacob Sacdalan
//SD1
//2/28/2018
public class Main {
private static int lineCount;



public static void main(String[] args) {
	String filePath;
	System.out.println("Input File Path: ");
	
	Scanner userInput = new Scanner(System.in);
	filePath = userInput.nextLine();
	
	Scanner scan = null;
	try {
		File file = new File(filePath);
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while(scan.hasNext()) {
		String line =  (String) scan.nextLine();
		if(line != null) {
			lineCount++;
		}
	}
	
	String fileName = new File(filePath).getName();
	System.out.println(fileName);
	System.out.println("LOC: " + lineCount);
}


}
